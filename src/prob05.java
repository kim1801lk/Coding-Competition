import java.util.*;

public class prob05 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);

		int num = Integer.parseInt(in.next());
		
		int d = 0;
		for (int i = 2; i< (num+1)/2; i++) {
			if (num%i == 0) {
				d++;
				System.out.printf("%d is NOT Prime\n", num);
				break;
			}
		}
		
		if (d==0) {
			System.out.printf("%d is PRIME\n", num);
		}
		
	}

}
