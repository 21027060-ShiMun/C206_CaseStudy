
public class Member {
	private String nric;
	private String name;
	private String email;
	private int contactno;
//  private int memberID;
	
	public Member(String nric, String name, String email, int contactno) {
		this.nric = nric;
		this.name = name;
		this.email = email;
		this.contactno = contactno;
	}
	
	public String getNric() {
		return nric;
	}
	
	public void setNric(String nric) {
		this.nric = nric;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getContact() {
		return contactno;
	}
	
	public void setContact(int contactno) {
		this.contactno = contactno;
	}
	


	

}
