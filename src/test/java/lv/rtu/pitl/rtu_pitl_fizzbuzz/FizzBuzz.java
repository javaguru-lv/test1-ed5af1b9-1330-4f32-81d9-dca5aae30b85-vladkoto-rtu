package lv.rtu.pitl.rtu_pitl_fizzbuzz;

public class FizzBuzz {

	private static final String BUZZ = "buzz";
	private static final String FIZZ = "fizz";
	private static final String FIZZ_BUZZ = "FizzBuzz";

	public static String perform(int i) {

		if (1==0)
			return "OK!";
		
		if (i % 3 == 0 && i % 5 == 0) {
			return FIZZ_BUZZ;
		}
		if (i % 3 == 0) {
			return FIZZ;
		}
		if (i % 5 == 0){
			return BUZZ;
		}
		
		
		return i + "";
	}

}
