import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int max = sc.nextInt();		
		int arr[] = new int[num];

		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		
		sc.close();
		
		for(int i=0;i<num;i++) {
			if(arr[i]<max) {
				System.out.print(arr[i]+" ");
			}
		}
		
	}

}