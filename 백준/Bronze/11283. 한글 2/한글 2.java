import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		char ch = A.charAt(0);
		int B = (int)ch - 44031;
		System.out.println(B);
	}
}