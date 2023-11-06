import java.util.*;
import java.io.*;

public class USACOFeedingTheCows {

	static Scanner in;
	static int N, K;
	
	
	public static void main(String[] args) {
		
		in = new Scanner (System.in);
		
		int trials = in.nextInt();
		
		for(int i = 0; i < trials; i++) {
	
			solve();
			System.out.println();
		}

	}
	
	static void solve() {
		
		 N = in.nextInt();
	     K = in.nextInt();
	    
	    int[] breeds = new int [N];
	    
	    String cows = in.next();
	    
	    for (int i = 0; i < N; i++) {
	    	if (cows.charAt(i) == 'G') {
	    		breeds[i] = 1;
	    	}
	    	else
	    		breeds[i] = 2;
	    }
	    
	    
	    // Array to store the patches of grass (1 = Guernsey grass, 2 = Holstein grass)
	    int[] patches = new int[N];
	    
	   
	    int numPatches = 0;
	    
	    
	    for (int i = 0; i < N; i++) {
	        // Check if there is a patch of grass within K positions that each cow can eat
	        boolean found = false;
	        for (int j = Math.max(0, i - K); j <= Math.min(N - 1, i + K); j++) {
	            if (patches[j] == breeds[i]) {
	                found = true;
	                break;
	            }
	        }
	        
	        
	        
	        
	        
	        //CHECK HERE
	        // If a suitable patch was not found, plant a new patch at the current position
	        if (!found) {
	        	
	        
	        
	            patches[Math.min(N-1,i+K)] = breeds[i];
	            
	        	
	        	numPatches++;
	        }
	    }

	    
	    
	    
	    
	    System.out.println(numPatches);
	    
	    // Print the configuration of patches
	    for (int i = 0; i < N; i++) {
	    	if (patches[i] == 0)
	    		System.out.print(".");
	    	else if (patches[i] == 1) {
	    		System.out.print("G");
	    	}
	    	else if (patches[i] == 2) {
	    		System.out.print("H");
	    	}
	    }
		
		
	}

}
