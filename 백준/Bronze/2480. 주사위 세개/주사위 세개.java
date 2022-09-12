import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int max;
		if(a!=b && b!=c && a!=c) {
			if(a>b) {
				if(c>a) {
					max=c;
				} else {
					max=a;
				}
			} else {
				if(c>b) {
					max=c;
				} else {
					max=b;
				}
			}
			System.out.println(max*100);
		} else if(a==b && a!=c) {
			System.out.println(1000+(a*100));
		} else if(a==c && a!=b) {
			System.out.println(1000+(a*100));
		} else if(b==c && b!=a) {
			System.out.println(1000+(b*100));
		} else if(a==b&& b==c) {
			System.out.println(10000+(a*1000));
		}
			
	}
}