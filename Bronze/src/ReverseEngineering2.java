import java.util.*;

public class ReverseEngineering2 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int K = sc.nextInt();
	    char[] cow = new char[N+1];
	    for (int i = 1; i <= N; i++) {
	      cow[i] = sc.next().charAt(0);
	    }

	    // Store the type of grass planted at each position
	    int[] patches = new int[N+1];
	    for (int i = 1; i <= N; i++) {
	      // Initialize the window to consider positions i-K, i-K+1, …, i+K-1, i+K
	      int l = Math.max(1, i-K);
	      int r = Math.min(N, i+K);
	      // Count the number of Guernsey cows and Holstein cows in the window
	      int numGuernseys = 0;
	      int numHolsteins = 0;
	      for (int j = l; j <= r; j++) {
	        if (cow[j] == 'G') {
	          numGuernseys++;
	        } else {
	          numHolsteins++;
	        }
	      }
	      // Plant a patch of grass at position i
	      if (numGuernseys > numHolsteins) {
	        patches[i] = 1;
	      } else if (numHolsteins > numGuernseys) {
	        patches[i] = 2;
	      } else {
	        // Choose either type of grass if there are an equal number of Guernsey and Holstein cows
	        patches[i] = Math.random() < 0.5 ? 1 : 2;
	      }
	    }

	    // Count the number of patches planted
	    int numPatches = 0;
	    for (int i = 1; i <= N; i++) {
	      if (patches[i] != 0) {
	        numPatches++;
	      }
	    }

	    // Print the number of patches and the configuration of patches
	    System.out.println(numPatches);
	    for (int i = 1; i <= N; i++) {
	      if (patches[i] == 1) {
	        System.out.print("G");
	      } else if (patches[i] == 2) {
	        System.out.print("H");
	      } else {
	        System.out.print("-");
	      }
	    }
	  } 
	
		
	}


