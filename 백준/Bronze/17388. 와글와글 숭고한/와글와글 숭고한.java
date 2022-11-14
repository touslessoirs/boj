import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a+b+c>=100) {
			System.out.println("OK");
		} else {
			if(a<b && a<c){
				System.out.println("Soongsil");
			} else if (b<a && b<c){
				System.out.println("Korea");
			} else if (c<a && c<b) {
				System.out.println("Hanyang");
			}
		}
	}
}