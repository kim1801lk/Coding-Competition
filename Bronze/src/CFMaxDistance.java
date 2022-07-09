import java.util.*;
public class CFMaxDistance {

	public static void main(String[] args) {
		

		Scanner input = new Scanner (System.in);
		
		int num = input.nextInt();
		
		int [] x = new int [num];
		int [] y = new int [num];
		
		for (int i = 0; i < num; i++) {
			x[i] = input.nextInt();
		}
		
		for (int i = 0; i < num; i++) {
			y[i] = input.nextInt();
		}
		
		int maxD = 0;
		
		for (int j = 0; j < num; j++) {
			
			
			for ( int i = j+1; i < num; i++) {
				maxD = Math.max(maxD, distance(x[i], x[j], y[i], y[j]));
			}
		
		}
		
		System.out.println(maxD);
	}
	
	public static int distance(int x1, int x2,  int y1,  int y2) {
		return (int)(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
	}

}
