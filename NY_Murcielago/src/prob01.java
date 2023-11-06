import java.io.FileReader;
import java.io.PrintWriter;
import java.util.*;

public class prob01 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		

		
		int n = Integer.parseInt(in.nextLine());
		
		
		for (int i = 0; i < n; i++) {
			
			int a = Integer.parseInt(in.nextLine());
			
			for (int j = 0; j < a; j++) {
			
			String[] name = in.nextLine().split(" ");
			
			char f = name[0].charAt(0);
			char m = name[1].charAt(0);
			char l = name[2].charAt(0);
			
			String mono = name[0].substring(0, 1) + name[2].substring(0, 1) + name[1].substring(0, 1) ;
			
			System.out.printf( mono.toUpperCase() );
			
			System.out.println();
			
		}
		}
		
		
		
		
		

	}

}
