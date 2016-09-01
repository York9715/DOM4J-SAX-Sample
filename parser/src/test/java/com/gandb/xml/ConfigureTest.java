/**
 * 
 */
package com.gandb.xml;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.util.List;
import java.util.TreeMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Misato
 *
 */
public class ConfigureTest {

	public ConfigureTest() {
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
		System.out.println("---- Initializing ConfigureTest ----");
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
	 * Test method for {@link com.gandb.xml.Configure#Configure(java.lang.String)}.
	 */
	@Test
	public final void testConfigure() {
		System.out.println("---- testConfigure ---");
		Configure configure = new Configure(App.CONFIGURATION_FILE);

		TreeMap<String, List<MatchedElement>> map = configure.getElementMap();
		assertNotNull(map);
		
		if (map.size() < 1)		
		 fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.gandb.xml.Configure#getElementMap()}.
	 */
	@Test
	public final void testGetElementMap() {
		System.out.println("---- testGetElementMap ---");
		Configure configure = new Configure(App.CONFIGURATION_FILE);

		TreeMap<String, List<MatchedElement>> map = configure.getElementMap();
		assertNotNull(map);

	}

	/**
	 * Test method for {@link com.gandb.xml.Configure#getConf(java.lang.String)}.
	 */
	@Test
	public final void testGetConf() {
		Configure configure = new Configure(App.CONFIGURATION_FILE);
		TreeMap<String, List<MatchedElement>> map =configure.getConf(App.CONFIGURATION_FILE);
		assertNotNull(map); 
		//fail("Not yet implemented"); // TODO
	}

}
