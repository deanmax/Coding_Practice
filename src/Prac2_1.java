import java.util.Scanner;

public class Prac2_1 {
	public static void main(String[] args) {
		Prac2_1 instance = new Prac2_1();
		boolean bool = instance.bool_decide();
		if (bool == true) {
			System.out.println("You have at least 2 true!");
		} else {
			System.out.println("You have no more than 1 true!");
		}
	}
	
	public boolean bool_decide() {
		boolean[] a = new boolean[3];
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first boolean(true/false): ");
		a[0] = scanner.nextBoolean();
		System.out.print("Enter second boolean(true/false): ");
		a[1] = scanner.nextBoolean();
		System.out.print("Enter third boolean(true/false): ");
		a[2] = scanner.nextBoolean();
		scanner.close();
		
		int count = 0;
		for(boolean i: a) {
			if (i == true) {
				count ++;
			}
		}
		
		if (count >= 2) {
			return true;
		}
		return false;
	}
}