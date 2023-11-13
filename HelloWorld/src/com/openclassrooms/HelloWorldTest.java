package com.openclassrooms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

	@Test
	public void testAjouter() {
		HelloWorld testHelloWorld = new HelloWorld();
		int somme = testHelloWorld.addNumbers(3, 3);
		assertEquals(6, somme);
	}

}
