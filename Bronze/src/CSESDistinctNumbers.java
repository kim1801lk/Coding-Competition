import java.util.*;
import java.io.*;
public class CSESDistinctNumbers {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int n = in.nextInt();
		
		int [] a = new int[n];
		
		for (int i = 0; i < n; i ++) {
			a[i] = in.nextInt();
		}
		
		Arrays.sort(a);
		
	
		
		int distinct = 1;
		int num = a[0];
		for (int i = 0; i < a.length; i++) {
			
			if (a[i] - num != 0) {
				num = a[i];
				distinct++;
			}
			
		}
		
		System.out.println(distinct);

	}

}
