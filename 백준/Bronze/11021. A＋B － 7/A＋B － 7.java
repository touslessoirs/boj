import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int num1[] = new int[total];
		int num2[] = new int[total];
		
		for(int i=0;i<total;i++) {
			num1[i] = sc.nextInt();
			num2[i] = sc.nextInt();
		}
		
		for(int i=0;i<total;i++) {
			System.out.println("Case #"+(i+1)+": "+(num1[i]+num2[i]));
		}
		
	}

}