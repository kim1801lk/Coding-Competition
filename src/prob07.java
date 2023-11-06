import java.util.*;

public class prob07 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		
		while (in.hasNext()) {
			String a = in.next();
			String b = in.next();
			
			if (a.equals(b)) {
				System.out.println(a);
				break;}
			
			//white
			else if (a.equals("WHITE")) {
				System.out.println("LIGHT " + b);
			}
			else if (b.equals("WHITE")) {
				System.out.println("LIGHT " + a);
			}
			
			//black
			else if (a.equals("BLACK")) {
				System.out.println("DARK " + b);
			}
			else if (b.equals("BLACK")) {
				System.out.println("DARK " + a);
			}
			
			//red and yellow
			else if (a.equals("RED") && b.equals("YELLOW")) {
				System.out.println("ORANGE");
			}
			else if (a.equals("YELLOW") && b.equals("RED")) {
				System.out.println("ORANGE");
			}
			
			//yellow and blue
			else if (a.equals("YELLOW") && b.equals("BLUE")) {
				System.out.println("GREEN");
			}
			else if (a.equals("BLUE") && b.equals("YELLOW")) {
				System.out.println("GREEN");
			}
			
			//red and blue
			else if (a.equals("RED") && b.equals("BLUE")) {
				System.out.println("PURPLE");
			}
			else if (a.equals("BLUE") && b.equals("RED")) {
				System.out.println("PURPLE");
			}
			
			
			
		}

	}

}
