import java.io.*;

public class USACOCowTipping {

	static final char FLIPPED = '0';
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new FileReader("cowtip.in"));
		PrintWriter out = new PrintWriter("cowtip.out");
		int width = Integer.parseInt(in.readLine());
		boolean[][] cows = new boolean[width][width];
		for (int r = 0; r < width; r++) {
			String row = in.readLine();
			for (int c = 0; c < width; c++) {
				cows[r][c] = row.charAt(c) != FLIPPED;
			}
		}

		int minFlips = 0;
		int x = width - 1;
		int y = width - 1;
		while (x >= 0 && y >= 0) {
			// Flip the rectangle with lower right corner at (x, y)
			minFlips += flip(x, y, cows) ? 1 : 0;
			if (x != y) {
				// Also flip rectangle at (y, x) if it is different
				minFlips += flip(y, x, cows) ? 1 : 0;
			}

			/*
			 * Transition to the next cell, first going to the left and then
			 * to the next row if the current row has finished.
			 */
			 if (x > 0) {
				x--;
			} else {
				y--;
				x = y;
			}
		}

		
		out.println(minFlips);
		in.close();
		out.close();

	}
	
	static boolean flip(int r, int c, boolean[][] cows) {
		if (cows[r][c]) {
			for (int ri = 0; ri <= r; ri++) {
				for (int ci = 0; ci <= c; ci++) {
					cows[ri][ci] = !cows[ri][ci];
				}
			}
			return true;
		}
		return false;
	}

}
