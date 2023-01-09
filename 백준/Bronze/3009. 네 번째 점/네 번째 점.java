import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] xArr = new int[4];
		int[] yArr = new int[4];
		for(int i=0;i<3;i++) {
			xArr[i] = sc.nextInt();
			yArr[i] = sc.nextInt();
		}
		if(xArr[0]==xArr[1]) {
			xArr[3]=xArr[2];
		} else if (xArr[0]==xArr[2]){
			xArr[3]=xArr[1];
		} else {
			xArr[3]=xArr[0];
		}
		
		if(yArr[0]==yArr[1]) {
			yArr[3]=yArr[2];
		} else if (yArr[0]==yArr[2]){
			yArr[3]=yArr[1];
		} else {
			yArr[3]=yArr[0];
		}

		System.out.println(xArr[3]+" "+yArr[3]);
	}
}