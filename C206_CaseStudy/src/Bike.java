
public class Bike extends Item{
	private String bikeType;
	
	public Bike(String assetTag, String description, double price, String bikeType) {
		super(assetTag, description, price);
		this.bikeType = bikeType;
	}
	
	public String getBikeType() {
		return bikeType;
	}
}
