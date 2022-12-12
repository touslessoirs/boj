import java.util.*;

public class Main {
		public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		int Bread= sc.nextInt();
		int Patty = sc.nextInt();
		
		Bread/=2;
		System.out.println(Bread<Patty?Bread:Patty);
	}
}