import java.util.*;
public class prob08_2018 {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner (System.in);
		
		int T = Integer.parseInt(in.nextLine());
		
		for (int i = 0; i < T; i++) {
			
			String[] inputString = in.nextLine().split(" ");
		
			double [] inputs = new double [3];
			
			for (int a= 0; a < 3; a++) {
				inputs [a] = Double.valueOf(inputString[a]) - 180;
				if (inputs[a] < 0)
					inputs[a] += 360;
			}
			
			
			System.out.printf("%.2f %.2f %.2f\n", inputs[0], inputs[1], inputs[2]);
		}
	}

}
