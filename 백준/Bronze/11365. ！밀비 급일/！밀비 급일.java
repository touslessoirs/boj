import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		while(true) {
			String line = br.readLine();
			if(line.equals("END")) break;
			sb = new StringBuffer(line);
			String reverseLine = sb.reverse().toString();
		System.out.println(reverseLine);
		}
	}
}