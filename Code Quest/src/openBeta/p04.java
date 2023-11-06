package openBeta;

import java.util.Scanner;

public class p04 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		double a = in.nextDouble();
		double b = in.nextDouble();
		double diff = 0;
		double total = 0;
		
		while (a != 0 && b != 0) {
			diff = b - a;
			
			System.out.printf("DIFF: %.1f\n", diff);
			total = total + diff;
			
			a = in.nextDouble();
			b = in.nextDouble();
			
		}
		
		System.out.printf("TOTAL: %.1f", total);
	}

}
