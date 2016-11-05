/**
 * 
 */
package de.unimannheim;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestSuite;

/**
 * @author Saimadhav S
 *
 */
public class TestCase extends TestSuite {

	protected double fValue1;
	protected double fValue2;

	@Before
	public void setUp() {
		fValue1 = 2.0;
		fValue2 = 3.0;
	}

	@Test
	public void testAdd() {
		// test data
		int num = 5;
		String str = "Junit is working fine";

		// check for equality
		assertEquals("Junit is working fine", str);

		// check for false condition
		assertFalse(num > 6);

		// check for not null value
		assertNotNull(str);
	}
}
