package lv.rtu.pitl.rtu_pitl_fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void testOne() {
		String result = FizzBuzz.perform(1);
		Assert.assertEquals("1", result);
	}@Test
	public void testFizzOnThree() {
		String result = FizzBuzz.perform(3);
		Assert.assertEquals("fizz", result);
	}
	@Test
	public void testFizzOnSix() {
		String result = FizzBuzz.perform(6);
		Assert.assertEquals("fizz", result);
	}
	
	@Test
	public void testBuzz() {
		String result = FizzBuzz.perform(5);
		Assert.assertEquals("buzz", result);
	}
	@Test
	public void testFizzBuzz() {
		String result = FizzBuzz.perform(15);
		Assert.assertEquals("FizzBuzz", result);
	}
	
}
