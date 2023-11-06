import java.util.*;
public class prob08 {

	public static void main(String[] args) {
		

		Scanner in = new Scanner (System.in);
		
		int T = Integer.parseInt(in.nextLine());
		
		double slope1 = 0;
		
		double slope2 = 0;
		
		
		for (int i = 0; i < T; i++) {
			
			int aircrafts = Integer.parseInt(in.nextLine());
			
			for (int j = 0; j < aircrafts; j++) {
				
				
				String name = in.nextLine();
				
				String [] aircraft = in.nextLine().split(",");
				String [] start = in.nextLine().split(",");
				String [] end = in.nextLine().split(",");
				
				//System.out.println(start[0] + " " + start[1]);
				
				slope1 = (Integer.valueOf(aircraft[1]) - Integer.valueOf(start[1]))/ (Integer.valueOf(aircraft[0]) - Integer.valueOf(start[0]));
				slope2 = (Integer.valueOf(aircraft[1]) - Integer.valueOf(end[1]))/ (Integer.valueOf(aircraft[0]) - Integer.valueOf(end[0]));
				
				if (slope1<=-0.8 && slope1 >= -1.6) {
					if (slope2<=-0.8 && slope2 >= -1.6) {
						System.out.println(name + ", Clear To Land!");
					}}
				else {
					System.out.println(name + ", Abort Landing!");
				}
				
			}
			
			slope1 = 0;
			slope2 = 0;
			
		}

	}

}
