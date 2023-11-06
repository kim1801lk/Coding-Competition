package C1;
import java.util.*;

public class DigitReassembly {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		long num = in.nextLong();
		long digits = in.nextLong();
		digits =  (long) Math.pow(10,  digits);
		long sum = 0;
		
	
		
		while (num > digits) {
			
			sum = sum + num % digits;
			num = num/10;
			
//			System.out.println(sum);
//			System.out.println(num);
//			System.out.println();
			
			
		}
		
		System.out.println(sum+ num);
		
		
		
		
	}

}
