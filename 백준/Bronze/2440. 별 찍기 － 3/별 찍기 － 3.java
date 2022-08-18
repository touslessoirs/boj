import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        for(int i=1;i<=num;i++){
            for(int s=0;s<=num-i;s++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}