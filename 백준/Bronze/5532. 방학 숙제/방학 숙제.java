import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int l = Integer.parseInt(br.readLine());
      int a = Integer.parseInt(br.readLine());
      int b = Integer.parseInt(br.readLine());
      double c = Double.parseDouble(br.readLine());
      double d = Double.parseDouble(br.readLine());
      
      int korean = (int)Math.ceil(a/c);
      int math = (int)Math.ceil(b/d);
      int holiday = l-(korean>math?korean:math);
      
      System.out.println(holiday);
	}
}