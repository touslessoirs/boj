import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        for(int i=1;i<=num;i++){
        	for(int b=1;b<=num-i;b++) {
        		System.out.print(" ");
        	} for(int s=1;s<=i*2-1;s++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=2;i<=num;i++){
	        for(int b=1;b<i;b++) {
	    		System.out.print(" ");
	    	} for(int s=1;s<=(num*2)-(2*i-1);s++){
	            System.out.print("*");
	        }
	        System.out.println();
        }   
        
	}

}