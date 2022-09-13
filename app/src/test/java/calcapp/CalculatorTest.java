package calcapp;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void addTwoNumbers() {
		Calculator calculator = new Calculator();
		int expected = 15;
		int actual = calculator.add(9, 6);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void subtractTwoNumbers() {
		Calculator calculator = new Calculator();
		int expected = 18;
		int actual = calculator.subtract(20, 2);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void multiplyTwoNumbers() {
		Calculator calculator = new Calculator();
		int expected = 54;
		int actual = calculator.multiply(6, 9);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void divideTwoNumbers() {
		Calculator calculator = new Calculator();
		int expected = 6;
		int actual = calculator.divide(60, 10);
		Assert.assertEquals(expected, actual);
	}

	@Test(expected = ArithmeticException.class)
	public void divideByZero() {
		Calculator calculator = new Calculator();
		calculator.divide(2, 0);
	}

}
