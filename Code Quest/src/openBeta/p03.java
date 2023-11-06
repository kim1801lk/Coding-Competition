package openBeta;

import java.util.Scanner;

public class p03 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		
		
		int num = in.nextInt();
		
		
		
		
		
		
		
		
		if (num == 0) {
			System.out.println("Start song");
		}
		else if (num == 1) {
			System.out.println("Restart song");
		}
		else if (num == 2) {
			System.out.println("Tempo up");
		}
		else if (num == 3) {
			System.out.println("Tempo down");
		}
		else if (num == 4) {
			System.out.println("Pause someone tripped");
		}
		else if (num == 5) {
			System.out.println("Drop the bass");
		}
		else if (num == 6) {
			System.out.println("Drop it lower!");
		}
		else if (num == 7) {
			System.out.println("Pitch higher");
		}
		else if (num == 8) {
			System.out.println("Pitch too high, shattering glass!");
		}
		else if (num == 9) {
			System.out.println("Get my agent on the phone");
		}
	}

}
