import java.util.ArrayList;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * LEW EN QUAN 21013885, 4/8/2022 10:10AM
 */

/**
 * @author 21013885
 *
 */
public class BikeMain {
	public static void main(String[] args) {
		ArrayList<Bike> bikeList = new ArrayList<Bike>();
		bikeList.add(new Bike("b001", "kid size", 500.00, "road"));
		bikeList.add(new Bike("b002", "teen size", 1000.00, "road"));
		bikeList.add(new Bike("b003", "adult size", 2000.00, "mountain"));

		int option = 0;

		while (option != 4) {

			BikeMain.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				// View all items
				BikeMain.viewAllBike(bikeList);

			} else if (option == 2) {
				// Add a new item
				BikeMain.setHeader("ADD");
				BikeMain.setHeader("ITEM TYPES");
				System.out.println("1. Bike");

				int itemType = Helper.readInt("Enter option to select item type > ");

				if (itemType == 1) {
					// Add a bike
					Bike b = inputBike();
					BikeMain.addBike(bikeList, b);
					System.out.println("Bike added");

				} else {
					System.out.println("Invalid type");
				}

			} else if (option == 3) {
				// Delete item
				BikeMain.setHeader("Delete");
				BikeMain.setHeader("ITEM TYPE");
				System.out.println("1. Bike");

				int itemType = Helper.readInt("Enter option to select item type > ");

				if (itemType == 1) {
					// Delete Bike
					String assetTag = Helper.readString("Enter asset tag > ");
					BikeMain.deleteBike(bikeList, assetTag);
				} else {
					System.out.println("Invalid type");
				}

			} else if (option == 4) {
				System.out.println("Bye!");
			} else {
				System.out.println("Invalid option");
			}

		}

	}

	public static void menu() {
		BikeMain.setHeader("RESOURCE CENTRE APP");
		System.out.println("1. Display Inventory");
		System.out.println("2. Add item");
		System.out.println("3. Delete item");
		System.out.println("4. Quit");
		Helper.line(80, "-");

	}

	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}

	// ================================= Option 1 View items (CRUD- Read)
	// =================================
	public static String retrieveAllBike(ArrayList<Bike> bikeList) {
		String output = "";

		for (int i = 0; i < bikeList.size(); i++) {

			output += String.format("%-10s %-30s %-10.2f %-10s \n", bikeList.get(i).getAssetTag(),
					bikeList.get(i).getDescription(), bikeList.get(i).getPrice(), bikeList.get(i).getBikeType());
		}
		return output;
	}

	public static void viewAllBike(ArrayList<Bike> bikeList) {
		BikeMain.setHeader("BIKE LIST");
		String output = retrieveAllBike(bikeList);

		System.out.println(output);
	}

	// ================================= Option 2 Add an item (CRUD - Add)
	// =================================
	public static Bike inputBike() {
		String assetTag = Helper.readString("Enter asset tag > ");
		String description = Helper.readString("Enter description > ");
		double price = Helper.readDouble("Enter price > ");
		String bikeType = Helper.readString("Enter bike type > ");

		Bike b = new Bike(assetTag, description, price, bikeType);
		return b;

	}

	public static void addBike(ArrayList<Bike> bikeList, Bike b) {

		bikeList.add(b);

	}

	// ================================= Option 3 Delete an item (CRUD - Delete)
	// =================================
	public static boolean removeBike(ArrayList<Bike> bikeList, String assettag) {

		boolean isDeleted = false;

		for (int i = 0; i < bikeList.size(); i++) {
			if (bikeList.get(i).getAssetTag().equals(assettag)) {
				bikeList.remove(i);
				isDeleted = true;
			}
		}
		return isDeleted;
	}

	public static String deleteBike(ArrayList<Bike> bikeList, String at) {
		BikeMain.retrieveAllBike(bikeList);
		String output = "Invalid asset tag entered";
		Boolean isDeleted = removeBike(bikeList, at);
		if (isDeleted == true) {

			output = "Asset Tag: " + at + "deleted";

		}
		return output;
	}
}
