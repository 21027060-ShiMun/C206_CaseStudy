
public class BikeParts extends Item{
	private String partType;
	
	public BikeParts(String assetTag, String description, double price, String partType) {
		super(assetTag, description, price);
		this.partType = partType;
	}
	
	public String getPartType() {
		return partType;
	}
}
