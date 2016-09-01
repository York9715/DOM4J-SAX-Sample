/**
 * 
 */
package com.gandb.xml;

import static org.junit.Assert.*;

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
public class SaxParserTest {

	public SaxParserTest() {
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
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.gandb.xml.SaxParser#parser(java.lang.String, java.lang.String)}.
	 */
	@Test
	public final void testParser() {
		System.out.println("---- SaxParserTest ---");
		SaxParser saxParser = new SaxParser();
		TreeMap<String, List<MatchedElement>> map = saxParser.parser(
				App.CONFIGURATION_FILE, "sample.xml");
		assertNotNull(map);
		assertTrue(map.size() > 0);
		checkSaxParser(map);
	}
	public void checkSaxParser(TreeMap<String, List<MatchedElement>> map) {

		if (map == null || map.get("ns2:Denomination") == null
				|| map.get("ns2:InventoryUnit") == null)
			fail("Test place could not be found using the radar method.");

		assertTrue(map.size() == 2);
		assertNotNull(map.get("ns2:Denomination"));
		assertNotNull(map.get("ns2:InventoryUnit"));
		assertTrue(map.get("ns2:Denomination").size() > 0);
		assertNotNull(map.get("ns2:Denomination").size() > 0);
	}
}
