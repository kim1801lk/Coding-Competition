import java.util.*;
public class prob03_2022 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int T = Integer.parseInt(in.nextLine());
		
		for (int i = 0; i < T; i++) {
			
			ArrayList<String> original = new ArrayList<String>();
			ArrayList<String> noDuplicates = new ArrayList<String>();
			
			
			int d = in.nextInt();
			int c = in.nextInt();
			
			
			
			for (int x = 0; x < d+c; x++) {
		
				original.add(in.next());
			
			}
			
			//if it's only listed in the database it needs to be inspected
			
			
			for (int y = 0; y < original.size(); y++) {
				
				String temp = original.get(0);
				original.remove(0);
				if (!original.contains(temp)) {
					noDuplicates.add(temp);
				}
				
				
				
			}
			
			for (int a = 0; a < noDuplicates.size(); a++) {
				
				System.out.println(noDuplicates.get(a));
			}
			
			
			
			
			
		}

	}

}
