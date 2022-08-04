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
		b1 = new Bike("b001", "kid size", 500, "road");
		b2 = new Bike("b002", "teen size", 1000, "road");
		b3 = new Bike("b003", "adult size", 2000, "mountain");

		bp1 = new BikeParts("bp001", "kid size", 500, "wheel");
		bp2 = new BikeParts("bp002", "teen size", 1000, "chain");
		bp3 = new BikeParts("bp003", "adult size", 2000, "handlebar");
		
		m1 = new Member("M001", "CoCo Tan", "tan@gmail.com", 91234567);
	    m2 = new Member("M002", "Amy Chan", "chan@gmail.com", 81234567);
	    m3 = new Member("M003", "Dan Lee", "lee@gmail.com", 98765432);
	    
	    apm1 = new Appointment("M001", "CoCo Tan", "tan@gmail.com", 91234567, "12-12-2022", "12:20:00");
	    apm2 = new Appointment("M002", "Amy Chan", "chan@gmail.com", 81234567, "16-12-2022", "14:50:00");
	    apm3 = new Appointment("M003", "Dan Lee", "lee@gmail.com", 98765432, "06-12-2022", "08:30:00");
	    
	    fb1 = new Feedback("M001", "CoCo Tan", "tan@gmail.com", 91234567, "Not satisfied with product", "Pending" );
	    fb2 = new Feedback("M002", "Amy Chan", "chan@gmail.com", 81234567, "Received broken product", "Pending" );
	    fb3 = new Feedback("M003", "Dan Lee", "lee@gmail.com", 98765432, "Received wrong product", "Pending" );

		bikeList = new ArrayList<Bike>();
		bikePartList = new ArrayList<BikeParts>();
		memberList = new ArrayList<Member>();
		appointmentList = new ArrayList<Appointment>();
		feedbackList = new ArrayList<Feedback>();
	}

	@Test
	// En Quan
	public void testAddBike() {
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid Bike arraylist to add to", bikeList);

		// Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.add(bikeList, b1);
		assertEquals("Test if that Bike arraylist size is 1?", 1, bikeList.size());

		// The item just added is as same as the first item of the list
		assertSame("Test that Bike is added same as 1st item of the list?", b1, bikeList.get(0));

		// Add another item. test The size of the list is 2?
		C206_CaseStudy.addBike(bikeList, b2);
		C206_CaseStudy.addBike(bikeList, b3);
		assertEquals("Test that Camcorder arraylist size is 3?", 3, bikeList.size());
		assertSame("Test that Camcorder is added same as 3rd item of the list?", b3, bikeList.get(2));
	}

	public void testRetrieveAllBike() {
		// Test if Item list is not null but empty, so that can add a new item
		assertNotNull("Test if there is valid Camcorder arraylist to add to", camcorderList);
		
		//test if the list of camcorders retrieved from the SourceCentre is empty
		String allCamcorder= C206_CaseStudy.retrieveAllCamcorder(camcorderList);
		String testOutput = "";
		assertEquals("Check that ViewAllCamcorderlist", testOutput, allCamcorder);
				
		//Given an empty list, after adding 2 items, test if the size of the list is 2
		C206_CaseStudy.addCamcorder(camcorderList, cc1);
		C206_CaseStudy.addCamcorder(camcorderList, cc2);
		assertEquals("Test if that Camcorder arraylist size is 2?", 2, camcorderList.size());
		
		//test if the expected output string same as the list of camcorders retrieved from the SourceCentre
		allCamcorder= C206_CaseStudy.retrieveAllCamcorder(camcorderList);

		testOutput = String.format("%-10s %-30s %-10s %-10s %-20d\n","CC0011", "Nikon HDSLR", "Yes", "", 40);
		testOutput += String.format("%-10s %-30s %-10s %-10s %-20d\n","CC0012", "Sony DSC-RX100M7", "Yes", "", 20);
	
		assertEquals("Check that ViewAllCamcorderlist", testOutput, allCamcorder);
	
	public 
	//En Quan
	
	//YuXuan -status (Start from here)
	@Test
	
	
	//YuXuan (End here)
	}
