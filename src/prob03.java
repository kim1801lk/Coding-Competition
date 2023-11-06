import java.util.*;

public class prob03 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner (System.in);
		
		int a = Integer.parseInt(in.next());
		int b = Integer.parseInt(in.next());
		int gcf = 0;
		
		for (int i = 1; i < a && i < b; i++) {
			if (a%i ==0 && b%i ==0) {
				if (i > gcf)
					gcf = i;
			}
		}
		
		System.out.println(gcf);
		

	}

}
