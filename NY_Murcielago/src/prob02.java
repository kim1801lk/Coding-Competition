import java.util.*;
import java.math.BigInteger;
public class prob02 {

	public static void main(String[] args)throws Exception {
		
		Scanner in = new Scanner (System.in);
		
		int T = Integer.parseInt(in.nextLine());
		
		BigInteger sum = new BigInteger("0");
		
		for (int i = 0; i < T; i++) {
			
			int teams = Integer.parseInt(in.nextLine());
			
			for (int j = 0; j < teams; j++) {
				
				sum = sum.add(in.nextBigInteger());
				
				
			}
			System.out.println(sum);
			sum =  new BigInteger("0");
		}
			

	}

}
