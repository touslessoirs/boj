import java.util.Arrays;
import java.util.Scanner;

public class Main{
	
    public static void main(String[] args){
    	
        Scanner sc = new Scanner(System.in);
		int[] A = new int[4];
		int[] B = new int[2];
        int maxA = 0;
        int maxB = 0;
        
        for(int i=0; i<4; i++){
            A[i] = sc.nextInt();
        }
        
        for(int i=0; i<2; i++){
        	B[i] = sc.nextInt();
        }
        
        Arrays.sort(A);
        maxA = A[1]+A[2]+A[3];
        
        maxB = Math.max(B[0], B[1]);
        
        System.out.println(maxA+maxB);
        
    }
}