import java.util.*;
public class prob09_2018 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int T = Integer.parseInt(in.nextLine());
		
		for (int i = 0; i < T; i++) {
			
			
			String[] inputString = in.nextLine().split(",");
			int [] input = {Integer.valueOf(inputString[0]), Integer.valueOf(inputString[1])};
			
			int m = Math.max(input[0], input[1]);
			int s = Math.min(input[0], input[1]);
			int d = m-s;
			
			for (int j = 0; j < 1000000; j++) {
			
			
			
			
			
			System.out.printf("%d-%d=%d\n", m, s, d);
			
			m = Math.max(s, d);
			s = Math.min(s, d);
			d = m-s;
			
			if (d == 0) {
				System.out.printf("%d-%d=%d\n", m, s, d);
				if (m == 1 && s == 1) {
					System.out.println("COPRIME");
					break;
				}
				else {
					System.out.println("NOT COPRIME");
					break;
				}
			}
				
			}
			
			
			
		}

	}

}
