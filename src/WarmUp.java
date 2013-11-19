public class WarmUp {
	public static void main(String[] args) {
		int i = 1;
		for(i = 1 ; i < 101; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + ": FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println(i + ": Fizz");
			} else if (i % 5 == 0) {
				System.out.println(i + ": Buzz");
			} else {
				System.out.println(i);
			}
		}
	}
}