package fr.cekogha.jenkinsjava.functions;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathOperationTest {

	MathOperations mO = new MathOperations();
	
	@Test
	public void testAddition() {
		// If a & b are integers
		assertEquals(mO.addition(2, 4), 6);

		// If a & b are opposite signs
		assertEquals(mO.addition(-2, 4), 2);

		// If a & b are commutative
		assertEquals(mO.addition(2, 4), mO.addition(4, 2));
	}

	@Test
	public void testSubstraction() {
		// If a & b are integers
		assertEquals(mO.substraction(2, 4), -2);

		// If a & b are opposite signs
		assertEquals(mO.substraction(-2, 4), -6);

		// If a & b are not commutative
		assertNotSame(mO.substraction(2, 4), mO.substraction(4, 2));
	}

}
