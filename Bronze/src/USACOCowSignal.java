import java.util.*;
import java.io.*;

public class USACOCowSignal {

	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner (new FileReader("cowsignal.in"));
		PrintWriter out = new PrintWriter("cowsignal.out");
		
		int m = in.nextInt();
		int n = in.nextInt();
		int k = in.nextInt();
		in.nextLine();
		
		char [][] miniSig = new char [m][n];
		
		for (int r = 0; r < m; r++) {
			
			String line = in.nextLine();
			System.out.println(line);
			for (int c = 0; c < n; c++) {
				miniSig[r][c] = line.charAt(c);
			}
			
		}
		
		for (int a = 0; a < m; a++) {
			for (int b = 0; b < k; b++) {
				for (int c = 0; c < n; c++) {
					for(int d = 0; d < k; d++) {
						out.print(miniSig[a][c]);
					}
				}
				out.println();
			}
			
		}
		
		in.close();
		out.close();
		
		//in.nextLine().split(" ")
	}

}
