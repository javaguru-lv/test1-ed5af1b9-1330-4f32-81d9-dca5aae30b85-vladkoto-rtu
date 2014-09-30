package lv.rtu.pitl.rtu_pitl_fizzbuzz;

public class FizzBuzz {

	private static final String BUZZ = "buzz";
	private static final String FIZZ = "fizz";

	public static String perform(int i) {
		final StringBuilder result = new StringBuilder();

		if (i % 3 == 0) {
			result.append(FIZZ);
		}

		if (i % 5 == 0) {
			result.append(BUZZ);
		}

		if (result.length() == 0) {
			result.append(i);
		}

		return result.toString();
	}

}
