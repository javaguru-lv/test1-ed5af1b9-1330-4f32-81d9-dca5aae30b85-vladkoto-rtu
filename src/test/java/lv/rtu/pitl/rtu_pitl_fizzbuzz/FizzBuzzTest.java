package lv.rtu.pitl.rtu_pitl_fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void testOne() {
		String actual = FizzBuzz.perform(1);
		Assert.assertEquals("1", actual);
	}
	
	@Test
	public void testTwo() {
		String actual = FizzBuzz.perform(2);
		Assert.assertEquals("2", actual);
	}

	@Test
	public void testFizz() {
		String actual = FizzBuzz.perform(3);
		Assert.assertEquals("fizz", actual);
	}
	
	@Test
	public void testBuzz() {
		String actual = FizzBuzz.perform(5);
		Assert.assertEquals("buzz", actual);
	}

	@Test
	public void testFizzBuzz() {
		String actual = FizzBuzz.perform(15);
		Assert.assertEquals("fizzbuzz", actual);
	}
}
