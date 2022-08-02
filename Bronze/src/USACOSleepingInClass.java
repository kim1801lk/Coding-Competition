import java.util.*;
import java.io.*;

public class USACOSleepingInClass {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int cases = in.nextInt();
		for (int i = 0; i < cases; i++) {
			int slept = in.nextInt();
			int [] numSleep = new int[slept];
			
			int sum = 0;
			for (int t = 0; t < slept; t++) {
				numSleep[t] = in.nextInt();
				sum += numSleep[t];
			}
			
			
			
			for (int r = slept; r > 0; r--) {
				
				if (sum % r ==0) {
					int targetSum = sum/r;
					int currSum = 0;
					boolean ans = true;
					
					for (int j = 0; j < slept; j++) {
						currSum += numSleep[j];
						
						if (currSum > targetSum) {
							ans = false;
							break;
						}
						if (currSum == targetSum) {
							currSum = 0;
						}
					}
					
					
					
					if (ans) {
						System.out.println(slept - r);
						break;
					}
				}
		}
				
		}
		
		

	}

		
		
		
		
	
	
}
