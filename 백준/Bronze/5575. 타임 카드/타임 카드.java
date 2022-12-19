import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			int h1 = sc.nextInt();
			int m1 = sc.nextInt();
			int s1 = sc.nextInt();
			int h2 = sc.nextInt();
			int m2 = sc.nextInt();
			int s2 = sc.nextInt();
			
			int startTime = h1*3600 + m1*60 + s1;
			int endTime = h2*3600 + m2*60 + s2;
			
			int totalTime = endTime-startTime;
			
			int h3 = totalTime/3600;
			int m3 = (totalTime%3600)/60;
			int s3 = (totalTime%3600)%60;
			
			System.out.println(h3+" "+m3+" "+s3);
		}
	}
}