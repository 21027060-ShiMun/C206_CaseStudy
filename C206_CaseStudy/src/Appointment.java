
public class Appointment extends Member{
	
	private String appDate;
	private String appTime;

	public Appointment(String nric, String name, String email, int contactno, 
			String appDate, String appTime) {
		super(nric, name, email, contactno);
		this.appDate = appDate;
		this.appTime = appTime;
	}
	
	public String getAppDate() {
		return appDate;
	}
	
	public void setAppDate(String appDate) {
		this.appDate =appDate;
	}
	
	public String getAppTime() {
		return appTime;
	}
	
	public void setAppTime(String appTime) {
		this.appTime = appTime;
	}

}
