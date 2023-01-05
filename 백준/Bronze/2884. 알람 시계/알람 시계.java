import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a==0) {
			if(b<45) {
				a=23;
				b+=15;
			} else {
				b-=45;
			}
		} else {
			if(b<45) {
				a-=1; 
				b+=15;
			} else {
				b-=45;
			}
		}
		
		System.out.print(a);
		System.out.print(" ");
		System.out.print(b);
	}
}