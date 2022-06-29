import java.util.*;
import java.io.*;

public class USACOLostCow {

	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner (new FileReader("lostcow.in"));
		PrintWriter out = new PrintWriter("lostcow.out");
		
		
		int x = in.nextInt();
		int y = in.nextInt();
		
		
		
		int iteration = 0;
		int distance = 1;
		
		while (x < y) {
			
			x = x + distance;
			
			distance = distance * -2;
			iteration++;
		}
	
		int sum = (int) ((1- Math.pow(2, iteration)) / (1 - 2));
		
		
		
		out.println(sum + x - y + 2);
		
		in.close();
		out.close();
		
	}

}
