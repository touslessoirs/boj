import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[4];

		for(int i=0;i<3;i++) {
			int sum=0;
			for(int j=0;j<4;j++) {
				arr[j]=sc.nextInt();
				if(arr[j]==1) sum++;
			}
			
			if(sum==3) {
				System.out.println("A");
			} else if (sum==2) {
				System.out.println("B");
			} else if (sum==1) {
				System.out.println("C");
			} else if (sum==0) {
				System.out.println("D");
			} else if (sum==4) {
				System.out.println("E");
			}
		}
		
	}
}