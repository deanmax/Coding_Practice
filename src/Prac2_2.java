import java.util.Scanner;

public class Prac2_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the string you want to reverse: ");
		String str = scanner.nextLine();
		scanner.close();
		
		Prac2_2 instance = new Prac2_2();
		System.out.println(instance.reverse(str));
		
	}
	
	public String reverse(String a) {
		char[] b = a.toCharArray();
		for (int i = 0, j = b.length-1; i < j; i++, j--) {
			char tmp = b[i];
			b[i] = b[j];
			b[j] = tmp;
		}
		return new String(b);
	}
}