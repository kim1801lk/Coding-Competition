import java.io.*;
import java.util.*;
public class USACOEvenMoreOddPhotos {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner (new FileReader("input.txt"));
		PrintWriter out = new PrintWriter("output.txt");
		
		
		int cow = in.nextInt();
		int [] id = new int[cow];
		for (int i = 0 ; i < cow; i++) {
			id[i] = in.nextInt();
		}
		
		
		int even = 0;
		int odd = 0;
		
		for (int i = 0 ; i < cow; i++) {
			if (id[i] %2 ==0)
				even++;
			else
				odd++;
		}
		
		int groups = even;
		
		if (even > odd) {
			groups = odd+1;
		}
		
		if (odd> even) {
		
			groups = groups + 2*(odd-even)%3;
			odd = odd - (odd-even)/3*odd;
			groups = groups + odd;
		
		
		
		}
		
		
		out.print(groups);
		in.close();
		out.close();
	}

}
