import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * LEW EN QUAN 21013885, 5/8/2022 10:10AM
 */

/**
 * @author 21013885
 *
 */
public class TestBike {
	private Bike b1;
	private Bike b2;
	private Bike b3;

	private ArrayList<Bike> bikeList;

	public TestBike() {
		super();
	}

	@Before
	public void setUp() throws Exception {
		b1 = new Bike("b001", "kid size", 500.00, "road");
		b2 = new Bike("b002", "teen size", 1000.00, "road");
		b3 = new Bike("b003", "adult size", 2000.00, "mountain");

		bikeList = new ArrayList<Bike>();

	}

	@Test
	public void testAddBike() {
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid Bike arraylist to add to", bikeList);

		// Given an empty list, after adding 1 item, the size of the list is 1
		BikeMain.addBike(bikeList, b1);
		assertEquals("Test if that Bike arraylist size is 1?", 1, bikeList.size());

		// The item just added is as same as the first item of the list
		assertSame("Test that Bike is added same as 1st item of the list?", b1, bikeList.get(0));

		// Add another item. test The size of the list is 2?
		BikeMain.addBike(bikeList, b2);
		BikeMain.addBike(bikeList, b3);
		assertEquals("Test that Bike arraylist size is 3?", 3, bikeList.size());
		assertSame("Test that Bike is added same as 3rd item of the list?", b3, bikeList.get(2));
	}

	@Test
	public void testRetrieveAllBike() {
		// Test if Item list is not null but empty, so that can add a new item
		assertNotNull("Test if there is valid Bike arraylist to add to", bikeList);

		// test if the list of bikes retrieved from the SourceCentre is empty
		String allBike = BikeMain.retrieveAllBike(bikeList);
		String testOutput = "";
		assertEquals("Check that ViewAllBikelist", testOutput, allBike);

		// Given an empty list, after adding 2 items, test if the size of the list is 2
		BikeMain.addBike(bikeList, b1);
		BikeMain.addBike(bikeList, b2);
		assertEquals("Test if that Bike arraylist size is 2?", 2, bikeList.size());

	}

	@Test
	public void testDeleteAppointment() {
		// Given an empty list, after adding 2 items, test if the size of the list is 2.
		// After removing an item , then the size of the list become 1
		BikeMain.addBike(bikeList, b1);
		BikeMain.addBike(bikeList, b2);
		assertEquals("Test if that Appointment arraylist size is 1?", 2, bikeList.size());

		// The item just added is as same as the first item of the list
		assertSame("Test that appointment is added same as the 1st appointment of the list?", b1, bikeList.get(0));

		// Test if feedbacks list is not null but empty, so that can add new item
		assertNotNull("test if there is valid Appointment arraylist to delete to", bikeList);

		// Delete the feedback , test the size of the list is 1
		BikeMain.removeBike(bikeList, b1.getAssetTag());
		assertEquals("Test that appointment arrayList is 0?", 1, bikeList.size());
		assertSame("Test that Appointment is added same as 3rd item of the list?", b2, bikeList.get(0));
	}

	@After
	public void tearDown() throws Exception {
		b1 = null;
		b2 = null;
		b3 = null;
		bikeList = null;

	}

}
