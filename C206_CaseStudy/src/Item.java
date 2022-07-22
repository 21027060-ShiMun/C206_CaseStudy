
public class Item {
	private String assetTag;
	private String description;
	private double price;
	private boolean isAvailable;

	public Item(String assetTag, String description, double price) {
		this.assetTag = assetTag;
		this.description = description;
		this.price = price;
		this.isAvailable = true;
	}
	

	public String getAssetTag() {
		return assetTag;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

}
