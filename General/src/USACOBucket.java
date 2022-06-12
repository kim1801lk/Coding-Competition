import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class USACOBucket {

	public static void main(String[] args) {
		
		
		BufferedReader in = new BufferedReader(new FileReader("buckets.in"));
		PrintWriter out = new PrintWriter("buckets.out");

		String [][] farm  = new String [10][10];
		String input;
		
		
		// HOw do you get a 2d array as an input for file processing?
		for (int r = 0;  r < 10; r++) {
			for (int c = 0; c < 10; c++) {
				farm [r][c] = in.readLine().split("");
			}
			}
		}
	}

}
