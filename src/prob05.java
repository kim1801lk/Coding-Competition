import java.util.*;

public class prob05 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);

		int n = Integer.parseInt(in.nextLine());
		String  [] dates = new String [n];
		
		
		for (int i = 0; i < n; i++) {
			dates[i] = in.nextLine();
		}
	
		
		for (int i = 0; i < n; i++) {
			String t = dates[i];
		dates[i] = t.substring(0, 5);
		}
		
	
		ArrayList<String> duplicates= new ArrayList<String>();
		
		
		for (int i = 0; i < n; i++) {
			String check = dates[i];
			
			for (int j = 0; j < n; j++) {
				String currString = dates[j];
				
				if (j != i) {
					
					if (check.equals(currString)){
				
						if (!duplicates.contains(currString))
							duplicates.add(currString);
					}
				}
									
			}
			
		}
		
		if (duplicates.size() == 0) {
			System.out.println("0\n" + "duplicates: None");
		}
		else {
			
			
			System.out.println(duplicates.size());
			
			
			System.out.print("duplicates: ");
			
			for (int i = 0; i < duplicates.size(); i++) {
				System.out.print(duplicates.get(i) + " ");
			}
			
			
		}
		
		
	}
	
	

}
