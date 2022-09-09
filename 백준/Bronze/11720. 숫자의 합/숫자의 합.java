import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String[] str = br.readLine().split("");
		int num=0;
		for(int i=0;i<n;i++) {
			num+=Integer.parseInt(str[i]);
		}
		System.out.println(num);
	}
}