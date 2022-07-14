import java.util.*;
import java.io.*;

public class USACODiamondC {

	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner (new FileReader("diamond.in"));
		PrintWriter out = new PrintWriter("diamond.out");

		int diamonds = in.nextInt();
		int diff = in.nextInt();
		
		int [] diamond = new int[diamonds];
		
		for (int i = 0; i < diamonds; i++) {
			diamond[i] = in.nextInt();
		}
		
		Arrays.sort(diamond);
		
		
		for (int i = diamond.length -1; i >=0; i--) {
			if (diamond[i]- diamond[0] > diff)
				diamonds--;
		
		}
		
		out.println(diamonds);
		
		in.close();
		out.close();
		
	}

}
