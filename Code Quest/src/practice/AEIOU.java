package practice;

import java.util.Scanner;

public class AEIOU {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		int n = Integer.parseInt(in.nextLine());
		
		
		
		char [] vowels = {'a', 'e', 'i', 'o', 'u'};
		
		
		for (int i = 0; i < n; i++) {
			
			String s = in.nextLine();
			int v = 0;
			
			for (int j = 0; j < s.length(); j++) {
				for (int c = 0; c < 5; c++) {
					if (s.charAt(j) == vowels[c]) {
						v++;
					}
				}
			}
			
			System.out.println(v);
		}

	}

}
