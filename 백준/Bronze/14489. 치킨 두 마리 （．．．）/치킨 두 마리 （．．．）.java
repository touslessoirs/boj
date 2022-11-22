import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int price = sc.nextInt();
		
		if((a+b)>=(price*2)) {
			System.out.println((a+b)-(price*2));
		} else {
			System.out.println(a+b);
		}
	}
}