import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String jinho = sc.nextLine();
		int num = Integer.parseInt(sc.nextLine());
		int result = 0;
		
		for(int i=0;i<num;i++) {
			String mbti = sc.nextLine();
			if(mbti.equals(jinho)) {
				result++;
			}
		}
		System.out.println(result);
	}
}