import java.util.*;
import java.io.*;

public class CFkayaks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//take input
		Scanner in = new Scanner (System.in);
		
		int N = in.nextInt() * 2; 
		int [] people = new int[N];
		for (int i = 0; i < N; i++) {
			people[i] = in.nextInt();
		}
		
		//sort input
		Arrays.sort(people);
		
		
		
		int minInstability = Integer.MAX_VALUE; 
		
		
		for (int i = 0; i < N; i++) {
			for (int j = i; j < N; j++) {
				ArrayList<Integer> newPeople = new ArrayList<>();
				for (int p = 0; p < N; p++) {
					if ((p != i) && (p !=j)){
						newPeople.add(people[p]);
					}
				}
				int totalInstability = 0;
				for (int p = 0; p < N-2; p+=2) {
					totalInstability += newPeople.get(p+1) - newPeople.get(p);
				}
				minInstability = Math.min(minInstability, totalInstability);
			}
		}
		
		System.out.println(minInstability);
	}

}
