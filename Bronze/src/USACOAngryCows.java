import java.util.*;
import java.io.*;
public class USACOAngryCows {

	public static void main(String[] args) throws IOException {
		

		Scanner in = new Scanner (new FileReader("input.txt"));
		PrintWriter out = new PrintWriter("output.txt");
		
		int n = in.nextInt();
		
		int [] position = new int[n];
		
		for (int i  =0; i < n; i++) {
			position[i] = in.nextInt();
		}
		
		
		Arrays.sort(position);
		
		for (int i = 0; i < n; i ++)
			out.print(position[i] + " ");
		
		out.println();
		int maxBales = Integer.MIN_VALUE;
		
		int currBales = 1;
		
		for (int i = 0; i < n; i++) {
		
			int range = 1;
			out.println("testing bale " + position[i]);
			
			
			
			for (int j = i; j < n; j++) {
				if (j+1 < n) {
					if (position[j+1] - position[j] <= range) {
						
						currBales++;
						range++;
					}
				}
				else
					break;
			}
			
			range = 1;
			
			for (int j = i; j >= 0; j--) {
				if (j-1 >= 0) {
					if (position[j] - position[j-1] <= range) {
						currBales++;
						range++;
					}
				}
				else
					break;
			}
			out.println("currBales: " + currBales);
			out.println();
			maxBales = Math.max(currBales, maxBales);
			currBales = 1;
		}

		
		out.println(maxBales);
		in.close();
		out.close();
	}

}
