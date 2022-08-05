
public class Item {
	private String assetTag;
	private String description;
	private double price;

	public Item(String assetTag, String description, double price) {
		this.assetTag = assetTag;
		this.description = description;
		this.price = price;

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

}
