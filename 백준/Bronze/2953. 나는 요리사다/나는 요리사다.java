import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max=0;
		int idx=0;
		for(int i=0;i<5;i++) {
			int sum=0;
			for(int j=0;j<4;j++) {
				int a = sc.nextInt();
				sum+=a;
				if(max<sum) {
					max=sum;
					idx=(i+1);
				}
			}
		}
		System.out.println(idx+" "+max);
	}
}