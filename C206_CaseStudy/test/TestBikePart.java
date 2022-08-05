import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * LEW EN QUAN 21013885, 4/8/2022 10:10AM
 */

/**
 * @author 21013885
 *
 */
public class TestBikePart {

	/**import static org.junit.Assert.*;

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
	private BikeParts bp1;
	private BikeParts bp2;
	private BikeParts bp3;

	private ArrayList<BikeParts> bikePartList;

	public TestBike() {
		super();
	}

	@Before
	public void setUp() throws Exception {
		bp1 = new BikeParts("bp001", "kid size", 500.00, "wheel");
		bp2 = new BikeParts("bp002", "teen size", 1000.00, "chain");
		bp3 = new BikeParts("bp003", "adult size", 2000.00, "handlebar");

		bikePartList = new ArrayList<BikeParts>();

	}

	@Test
	public void testAddBikePart() {
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid Bike Prts arraylist to add to", bikePartList);

		// Given an empty list, after adding 1 item, the size of the list is 1
		BikeMain.addBikePart(bikePartList, bp1);
		assertEquals("Test if that Bike Part arraylist size is 1?", 1, bikePartList.size());

		// The item just added is as same as the first item of the list
		assertSame("Test that Bike is added same as 1st item of the list?", bp1, bikePartList.get(0));

		// Add another item. test The size of the list is 2?
		BikeMain.addBikePart(bikePartList, bp2);
		BikeMain.addBikePart(bikePartList, bp3);
		assertEquals("Test that Bike arraylist size is 3?", 3, bikePartList.size());
		assertSame("Test that Bike is added same as 3rd item of the list?", bp3, bikePartList.get(2));
	}

	@Test
	public void testRetrieveAllBikePart() {
		// Test if Item list is not null but empty, so that can add a new item
		assertNotNull("Test if there is valid Bike arraylist to add to", bikePartList);

		// test if the list of bikes retrieved from the SourceCentre is empty
		String allBikePart = BikeMain.retrieveAllBikePart(bikePartList);
		String testOutput = "";
		assertEquals("Check that ViewAllBikePartlist", testOutput, allBikePart);

		// Given an empty list, after adding 2 items, test if the size of the list is 2
		BikePartMain.addBikePart(bikePartList, bp1);
		BikePartMain.addBikePart(bikePartList, bp2);
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

	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@After
	public void tearDown() throws Exception {
	}

	
}
