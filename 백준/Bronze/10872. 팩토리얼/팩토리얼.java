import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int total = 1;
		
		for(int i=1;i<=num;i++) {
			total *= i;
		}
		System.out.println(total);
		
	}

}