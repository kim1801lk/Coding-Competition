import java.util.*;


public class prob02 {

	public static void main(String[] args) {
		

		Scanner in = new Scanner (System.in);

		 double h = in.nextDouble();
	        double r = in.nextDouble();
	        double volume = Math.PI * h * r * r;
	        
	        System.out.printf("%.2f cubic inches", volume);        
	}

}
