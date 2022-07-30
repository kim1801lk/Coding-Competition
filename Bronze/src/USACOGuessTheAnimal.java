import java.util.*;
import java.io.*;
public class USACOGuessTheAnimal {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner (new FileReader("guess.in"));
		PrintWriter out = new PrintWriter("guess.out");
		int aNum = Integer.parseInt(in.next());
		
		HashSet <String>[] animals = new HashSet[aNum];
		
		
		for (int i = 0; i < aNum; i++) {
			animals[i] = new HashSet<>();
			in.next();
			int numA = Integer.parseInt(in.next());
			
			
			for (int j = 0; j < numA; j++)
			animals[i].add(in.next());
		}
		
		
		
		int max = 0;
		for (int a1= 0; a1 <aNum; a1++) {
			for (int a2 = a1+1; a2 <aNum; a2++) {
				HashSet<String> a1Copy = new HashSet<>(animals[a1]);
				a1Copy.retainAll(animals[a2]);
				max = Math.max(max, a1Copy.size() + 1);
			}
		}
		
		out.print(max);
		
		in.close();
		out.close();
		
	}

}
