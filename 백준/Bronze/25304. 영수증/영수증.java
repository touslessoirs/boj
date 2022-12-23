import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int recipe = sc.nextInt();
		int a = sc.nextInt();
		int total=0;
		
		for(int i=0;i<a;i++) {
			int price = sc.nextInt();
			int num = sc.nextInt();
			total+=(price*num);
		}
		
		if(recipe==total) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}