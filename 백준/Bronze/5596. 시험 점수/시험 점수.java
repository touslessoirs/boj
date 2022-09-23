import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] min = new int[4];
		int[] man = new int[4];
		int minsum=0;
		int mansum=0;
		
		for(int i=0;i<4;i++) {
			min[i] = sc.nextInt();
			minsum += min[i];
		}
		
		for(int i=0;i<4;i++) {
			man[i] = sc.nextInt();
			mansum += man[i];
		}
		
		if(minsum<mansum) {
			System.out.println(mansum);
		} else {
			System.out.println(minsum);
		}
		
	}
}