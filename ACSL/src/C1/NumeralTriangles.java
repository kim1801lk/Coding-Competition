package C1;
import java.util.*;
import java.io.*;
public class NumeralTriangles {

	static Scanner in;
	static int start, delta, rows;
	
	public static void main(String[] args) {
		
		in = new Scanner (System.in);
		
		for (int i = 0; i < 5; i++) solve();
	}

	static void solve() {
		
		//changing input variables to base 10
		start = Integer.parseInt(in.next(), 8);
		delta = Integer.parseInt(in.next(), 8);
		rows = in.nextInt();
		
		
		//getting number of iterations for the numbers not needed
		int repeat = (rows - 1)*rows/2;
		
		
		//getting to the numbers that matter
		for (int i = 0; i < repeat-1; i++)
			start = start + delta;
		
		//making string of the digits of the last row
		//making sure the digits are first in base 8
		String lastRow = "";
		for (int i = 0; i < rows; i++) {
			start = start + delta;
			lastRow = lastRow + Integer.toOctalString(start);
			
		}
		
		//summing the digits of the last row as if they're base 10
		int ans = 0; 
		for ( int i = 0; i < lastRow.length(); i++) {
			ans = ans + lastRow.charAt(i) - '0';
		}
		
		//printing answer
		System.out.println(ans);
		
	}
	
}
