import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);                                                             
 
        while(true){
            int girl = sc.nextInt();
            int boy = sc.nextInt();
 
            if(girl==0 && boy==0)
                break;
            System.out.println(girl+boy);
        }
        
    }
}