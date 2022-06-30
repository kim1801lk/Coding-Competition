import java.io.*;
import java.util.*;

public class USACOBovineShuffle {

	public static void main(String[] args) throws IOException {
		
		
		// only worked for first test case
		
		
		Scanner in = new Scanner (new FileReader("shuffle.in"));
		PrintWriter out = new PrintWriter("shuffle.out");
		
		int cows = in.nextInt();
		
		
		int [] shuffle = new int [cows];
		for (int i =0; i < cows; i++) {
			shuffle [i] = in.nextInt();
		}
		
		
		int [] cowID = new int [cows];
		for (int i = 0; i < cows; i++) {
			cowID [i] = in.nextInt();
		}
		
		
		int num = 1;

		
		for (int i = 0; i < cows*cows; i ++) {
			
			for (int n = 0; n < cows; n++) {
			if (num == shuffle[n]) {
				out.println(cowID[n]);
			
				num++;
				break;
			}
			}
			
			
		}
		


		in.close();
		out.close();
	}

}
