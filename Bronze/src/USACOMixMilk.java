
import java.util.*;
import java.io.*;
public class USACOMixMilk {

	static int N = 3;
	static int [] milk = new int[N];
	static int [] capacity = new int [N];
	
	
	public static void main(String[] args) throws IOException{
		
		Scanner in = new Scanner (new FileReader("mixmilk.in"));
		PrintWriter out = new PrintWriter("mixmilk.out");
		
	
		for (int i = 0; i < N; i ++) {
			capacity [i] = in.nextInt();
			milk [i] = in.nextInt();
		}
		
		
		for (int i = 0; i < 100; i++) {
			pour(i%3, (i+1)%3);
		}

		for (int i = 0; i < N; i++) {
			out.println(milk[i]);
		}
		
		in.close();
		out.close();
	}
	
	public static void pour(int i, int j) {
		
		int amount = Math.min(milk[i], capacity [j]- milk[j]);
		
		milk[i] -= amount;
		milk [j] +=amount;
	}

}
