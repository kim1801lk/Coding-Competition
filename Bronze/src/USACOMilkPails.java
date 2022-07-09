import java.util.*;
import java.io.*;

public class USACOMilkPails  {

	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner (new FileReader("pails.in"));
		PrintWriter out = new PrintWriter("pails.out");

		int x = in.nextInt();
		int y = in.nextInt();
		int m = in.nextInt();
		int max = 0;
		int xMax = m/x;
		int yMax = m/y;
		
		for (int i = 0; i <= xMax; i++) {
			for (int j = 0; j <= yMax; j++) {
				if (i*x + j*y > max && i*x + j*y<=m)
					max = i*x +j*y ;
			}
		}
		
		out.println(max);
		in.close();
		out.close();
	}

}
