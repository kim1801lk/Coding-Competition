import java.util.*;
import java.io.*;

public class USACOLostCow {

	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner (new FileReader("lostcow.in"));
		PrintWriter out = new PrintWriter("lostcow.out");
		
		//only works for 4 test cases....
		
		int x = in.nextInt();
		int y = in.nextInt();
		
		
		int traveling = 1;
		int totalDistance = 0;
		int position = x;
		int previousP = x;
		
		while (position < y) {
			
			
			previousP = position;
			position = x + traveling;
			//out.println("current position " + position);
			totalDistance = totalDistance + Math.abs(position - previousP);
			//out.println("distance traveled: " + totalDistance);
			traveling = traveling * -2;
			
		}
		
		
		//out.println("final position " + position);
		out.println(totalDistance - Math.abs(position - y));
		
		in.close();
		out.close();
		
	}

}
