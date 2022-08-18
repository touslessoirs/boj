import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        for(int i=1;i<=num;i++){
            for(int b=1;b<=num-i;b++){
                System.out.print(" ");
            }
            for(int s=1;s<=i;s++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}