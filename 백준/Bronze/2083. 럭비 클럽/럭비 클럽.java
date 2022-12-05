import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
      while (true) {
			String str = sc.next();
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if (str.equals("#") && A==0 && B==0) {
				break;
			}
			
			if(A>17 || B>=80) {
				System.out.println(str+" Senior");
			} else {
				System.out.println(str+" Junior");
			}
      }
	}
}