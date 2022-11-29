import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = Integer.parseInt(sc.nextLine());
		String B = sc.nextLine();
		int n0 = A * (B.charAt(0)-'0');
		int n1 = A * (B.charAt(1)-'0');
		int n2 = A * (B.charAt(2)-'0');
		
		System.out.println(n2);
		System.out.println(n1);
		System.out.println(n0);
		System.out.println(A*(Integer.parseInt(B)));

		sc.close();
		
	}
	
}