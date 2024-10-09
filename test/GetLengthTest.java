package org.jfree.data;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GetLengthTest {

	private Range actual;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}


	@BeforeEach
	void setUp() throws Exception {
	}
	@Test
	void testZeroLower() {
		actual = new Range(0,10);
		assertEquals(10,actual.getLength());
	}
	@Test
	void testZeroHigher() {
		actual = new Range(-10,0);
		assertEquals(10,actual.getLength());
	}
	@Test
	void testNegToPos() {
		actual = new Range(-1,1);
		assertEquals(2,actual.getLength());
	}
	@Test
	void testSame() {
		actual = new Range(1,1);
		assertEquals(0,actual.getLength());
	}
	@Test
	void testNegToNeg() {
		actual = new Range(-2,-1);
		assertEquals(1,actual.getLength());
	}
	@Test
	void testPosToPos() {
		actual = new Range(1,10);
		assertEquals(9,actual.getLength());
	}
	@AfterEach
	void tearDown() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

}

