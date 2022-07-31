
public class Feedback extends Member{
	
	private String feedback;
	private String statues;

	public Feedback(String nric, String name, String email, int contactno,
			String feedback, String statues) {
		super(nric, name, email, contactno);
		this.feedback = feedback;
		this.statues = statues;
	}
	
	public String getFeedback() {
		return feedback;
	}
	
	public void setFeedback(String feedback) {
		this.feedback =feedback;
	}
	
	public String getStatues() {
		return statues;
	}
	
	public void setStatues(String statues) {
		this.statues =statues;
	}
	

}
