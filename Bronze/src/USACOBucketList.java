import java.io.*;
import java.util.*;

public class USACOBucketList {

	public static void main(String[] args) throws IOException{
		
		Scanner in = new Scanner (new FileReader("blist.in"));
		PrintWriter out = new PrintWriter("shuffle.out");
		

		int cow = in.nextInt();
		
		int [][] cowInfo = new int [cow][3];
		
		for (int i = 0; i < cow; i++) {
			
			for (int n = 0; n < 3; n++)
				cowInfo[i][n] = in.nextInt();
		}
		
		
		int buckets = cowInfo[0][2];
		
		
		//sort 2D in earliest to latest starting time for each cow
		int earliest = cowInfo[0][0];
		int [] swap = cowInfo[0];
		
		for (int i = 0; i < cow; i++) {
			
		}
		
		//looking at two cows at a time, see if first cow's end time is before or after the second cow's start time
		// if before: the number of buckets needed for the first cow is available for the second cow
		//if after: an additional number of buckets is needed ( the number of buckets is the number of buckets needed for the second cow)
		//keep the number of buckets needed the same unless a greater number of buckets is needed 
		// maybe have two variables: buckets available and buckets needed
		//		if buckets needed exceeds buckets available, then buckets available = buckets needed
		//		at the end, print buckets available
		
		
		
		in.close();
		out.close();
	}

}
