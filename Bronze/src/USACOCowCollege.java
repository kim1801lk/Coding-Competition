import java.util.*;
import java.io.*;
public class USACOCowCollege {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		long numCow = in.nextInt();
		long[]tuition = new long [(int) numCow];
		
		for (int i = 0; i < numCow; i++) {
			tuition[i] = in.nextInt();
		}
		Arrays.sort(tuition);
		
		
		
		
		//testing for maximum tuition
		long maxP = tuition[0] * numCow;
		long currMinT = tuition[0];
		long possCow = numCow;
		
		long bestT = 0;
		long bestC = 0;

		for (int i = 1; i < numCow; i++) {
			
	
				
				currMinT = tuition[i];
				possCow = possCow - 1;
				
				if (currMinT * possCow > maxP) {
					maxP = currMinT * possCow;
					bestT = currMinT;
					bestC = possCow;
				}
				
				
			
		
				
		}
		
		System.out.print(maxP + " " + bestT);
		
	}
	

}
