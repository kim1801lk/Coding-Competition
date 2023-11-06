import java.util.*;

public class prob06_2022 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int T = Integer.parseInt(in.nextLine());
		
		for (int i = 0; i < T; i++) {
			
			int expected = in.nextInt();
			
			int [] numbers = new int [expected - 1];
			
			for (int a = 0; a < numbers.length; a++) {
				numbers [a] = in.nextInt();
			}
			
			Arrays.sort(numbers);
			
			for (int n = 1; n <= numbers.length; n++ ) {
				if (numbers[n-1] != n) {
					System.out.println(n);
					break;
				}
			}
			
			
		}

	}

}
