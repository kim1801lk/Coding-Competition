import java.io.*;
public class USACOTeleport {

	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new FileReader("teleport.in"));
		PrintWriter out = new PrintWriter("teleport.out");
		
		String [] input = in.readLine().split(" ");
		int a = Integer.parseInt(input [0]);
		int b = Integer.parseInt(input [1]);
		int x = Integer.parseInt(input [2]);
		int y = Integer.parseInt(input [3]);
		
		//case 1 : distance traveled without teleporter
		
		int result = Math.abs(a-b);
		
		//case 2: a -> x -> y -> b
		
		result = Math.min(result, Math.abs(a-x) + Math.abs(b-y));
		
		//case 3: a - > y --> x --> b
		
		result = Math.min(result, Math.abs(a-y) + Math.abs(x-b));
		
		out.println(result);
		in.close();
		out.close();
	}

}
