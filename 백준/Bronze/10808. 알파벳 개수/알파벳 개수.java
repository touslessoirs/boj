import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		int[] num = new int[26];
		for(int i = 0;i<str.length();i++) {
			num[str.charAt(i)-97]++;
		}
		for(int i=0;i<26;i++) {
			System.out.print(num[i]+" ");
		}
	}
}