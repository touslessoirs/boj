import java.util.*;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int[] menu = new int[5];
		for(int i=0;i<5;i++) {
			menu[i]=sc.nextInt();
		}
		
		int burger=menu[0];
		for(int i=0;i<3;i++) {
			if(burger>menu[i]) {
				burger=menu[i];
			}
		}
		
		int drink=menu[3];
		for(int i=3;i<5;i++) {
			if(drink>menu[i]) {
				drink=menu[i];
			}
		}
		
		System.out.println(burger+drink-50);
	}
}