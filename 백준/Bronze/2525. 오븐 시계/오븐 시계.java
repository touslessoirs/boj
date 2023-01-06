import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int m = (60*a)+b;
		m+=c;
		int hh = 0;
		if((m/60)>=24) {
			hh=(m/60)-24;
		} else {
			hh=(m/60);
		}
		int mm = m%60;
		System.out.println(hh+" "+mm);
	}
}