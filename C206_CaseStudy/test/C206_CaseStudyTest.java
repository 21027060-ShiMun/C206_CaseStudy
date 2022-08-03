import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
// C206 AY2022 SEM1 - Eclipse 21-09 JDK16
public class C206_CaseStudyTest {
	// prepare test data
	
	private Bike b1;
	private Bike b2;
	private Bike b3;
	
	private BikeParts bp1;
	private BikeParts bp2;
	private BikeParts bp3;
	
	private Member m1;
	private Member m2;
	private Member m3;
	
	private Appointment apm1;
	private Appointment apm2;
	private Appointment apm3;
	
	private Feedback fb1;
	private Feedback fb2;
	private Feedback fb3;	
	
	private ArrayList<Bike> bikeList;
	private ArrayList<BikeParts> bikePartList;
	private ArrayList<Member> memberList;
	private ArrayList<Appointment> appointmentList;
	private ArrayList<Feedback> feedbackList;

	
	public C206_CaseStudyTest() {
		super();
	}
	
	@Before
	public void setUp() throws Exception {
		// prepare test data
		b1 = new Bike();
		b2 = new Bike();
		b3 = new Bike();

		bp1 = new BikeParts();
		bp2 = new BikeParts();
		bp3 = new BikeParts();
		
		
		
		bikeList = new ArrayList<Bike>();
		bikePartList = new ArrayList<BikeParts>();		
	}
	
	@Test
	public void testAddBike() {
		// Item list is not null, so that can add a new item
				assertNotNull("Test if there is valid Bike arraylist to add to", bikeList);
				
				//Given an empty list, after adding 1 item, the size of the list is 1
				CaseStudy.add(bikeList, b1);		
				assertEquals("Test if that Bike arraylist size is 1?", 1, bikeList.size());
				
				//The item just added is as same as the first item of the list
				assertSame("Test that Bike is added same as 1st item of the list?", b1, bikeList.get(0));
				
				//Add another item. test The size of the list is 2?
				CaseStudy.addBike(bikeList, b2);
				CaseStudy.addBike(bikeList, b3);
				assertEquals("Test that Camcorder arraylist size is 3?", 3, bikeList.size());
				assertSame("Test that Camcorder is added same as 3rd item of the list?", b3, bikeList.get(2));
			}
	}
	
}
