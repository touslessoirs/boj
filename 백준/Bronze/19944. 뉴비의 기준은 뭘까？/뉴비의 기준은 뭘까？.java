import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String result="";
		
		if(b<=2) {
			result = "NEWBIE!";
		} else if (2<=b && b<=a) {
			result = "OLDBIE!";
		} else {
			result = "TLE!";
		}
		
		System.out.println(result);
		
	}
}