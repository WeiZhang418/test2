package test2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private static Calculator calculator=new Calculator();
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
	    calculator.add(2);
        calculator.add(3);
        assertEquals(5, calculator.getResult());
	}

	@Test
	public void testSubstract() {

	}

 
	@Test
	public void testMultiply() {

	}


    @Test(expected =ArithmeticException.class)
	public void testDivide() {
        calculator.add(8);
        calculator.divide(0);
        assertEquals(4,calculator.getResult());
	}

}
