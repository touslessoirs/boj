import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int result = (a/10)+(a%10);
		
		if (a==1010) {
			result = 20;
		} else if (a/10>10) {
			result = (a/100)+(a%100);
		}
		
		System.out.println(result);
	}
}