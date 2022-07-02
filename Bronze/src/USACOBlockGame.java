import java.util.*;
import java.io.*;
public class USACOBlockGame {

	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner (new FileReader("blocks.in"));
		PrintWriter out = new PrintWriter("blocks.out");

		int num = in.nextInt();
		
		int [] ans = new int[26];
		
		for(int i = 0; i < num; i++) {
			
			int [] freq1 = new int[26];
			int [] freq2 = new int [26];
			
			String word1 = in.next();
			
			for (int a = 0; a < word1.length(); a++) {
				
				freq1[(int) word1.charAt(a) - 97]++;
			}
			
			
			String word2 = in.next();
			
			for (int b = 0; b < word2.length(); b++) {
				
				freq2[(int) word2.charAt(b) - 97]++;
			}
			
			
			
			for (int a = 0; a < 26; a ++) {
				ans[a] = ans[a] + Math.max(freq1[a], freq2[a]);
			}
			
			
		}
		
		for (int i = 0; i < 26; i++) {
			out.println(ans[i]);
		}
		
		in.close();
		out.close();
	}

}
