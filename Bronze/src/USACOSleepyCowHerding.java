import java.util.*;
import java.io.*;

public class USACOSleepyCowHerding {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		

		Scanner in = new Scanner (new FileReader("herding.in"));
		PrintWriter out = new PrintWriter("herding.out");
		
		int [] position = new int [3];
		
		for (int i = 0; i < 3; i++) {
			position [i] = in.nextInt();
		}
		
		
		Arrays.sort(position);
		
		
		if (position[2] == position[0] + 2) {
			out.println(0);
		}
		else if (position[1] == position[0] + 2 || position[1] + 2 == position [2]) {
			out.println(1);
		}
		else
			out.println(2);
		
		
		out.println(Math.max(position [1] - position[0], position[2] - position[1] )-1);
			
		
		
		
		
	
			
		
		
		in.close();
		out.close();
	}

}
