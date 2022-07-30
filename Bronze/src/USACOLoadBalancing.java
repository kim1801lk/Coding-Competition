import java.util.*;
import java.io.*;
public class USACOLoadBalancing {

	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner (new FileReader("input.txt"));
		PrintWriter out = new PrintWriter("output.txt");

		
		int cow = in.nextInt();
		in.next();
		
		int [] x = new int[cow];
		int []y = new int[cow];
		Set <Integer> vfences = new HashSet<>();
 		Set <Integer> hfences = new HashSet<>();
		
 		for (int i = 0; i < cow; i++) {
			x[i] = in.nextInt();
			y[i] = in.nextInt();
			vfences.add(x[i] +1);
			hfences.add(y[i] + 1);
		}
 		
 		int minImbalance = cow;
 		
 		for (int v : vfences) {
 			for (int h : hfences) {
 				int topLeft = 0;
 				int topRight = 0;
 				int bottomLeft = 0; 
 				int bottomRight = 0;
 				
 				for (int i = 0; i < cow; i++) {
 					if (x[i] < v && y[i] > h) {
 						topLeft++;
 					}
 					else if (x[i] > v && y[i] > h) {
 						topLeft++;
 					}
 					else if (x[i] < v && y[i] < h) {
 						topLeft++;
 					}
 					else if (x[i] > v && y[i] < h) {
 						topLeft++;
 					}
 				}
 				
 				int currImbalance = Collections.max(Arrays.asList(topLeft, topRight, bottomLeft, bottomRight));
 				
 				minImbalance = Math.min(minImbalance,  currImbalance);
 			}
 		}
		
 		out.println(minImbalance);
 		
 		
		
		
		
		
		
		
		
		in.close();
		out.close();
	}

}
