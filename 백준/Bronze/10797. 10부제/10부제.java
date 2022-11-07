import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int car = 0;
		int cnt = 0;
		for (int i=0; i<5; i++) {
			car = sc.nextInt();
			if (num==car) {
				cnt++;
			}
		}
		sc.close();
		System.out.println(cnt);
	}
}