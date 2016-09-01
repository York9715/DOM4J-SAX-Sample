/**
 * 
 */
package com.gandb.xml;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import static org.junit.Assert.*;

import java.io.InputStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * @author Misato
 *
 */
public class AppTest {

	public AppTest() {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("---- Initializing tests ----");
		try {
			InputStream in = AppTest.class.getResourceAsStream("/"
					+ App.CONFIGURATION_FILE);
			if (in == null)
				fail(App.CONFIGURATION_FILE + " not found");
		} catch (Exception e) {
			fail(e.getMessage());
		}		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.gandb.xml.App#run(java.lang.String)}.
	 */
	@Test
	public final void testRun() {
		System.out.println("---- Test App ---");
		App app = new App();
		// app.run("");		
		//fail("Not yet implemented"); // TODO
	}

}
