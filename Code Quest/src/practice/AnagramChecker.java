package practice;

import java.util.Scanner;

public class AnagramChecker {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		int n = Integer.parseInt(in.nextLine());
		

		for (int i = 0; i < n; i++) {
			
			String s = in.nextLine();
			String o = s;
			String l = s.substring(0, s.length()/2);
			String k = s.substring(s.length()/2 + 1);
			
			
//			String s1 = "";
//			
//			for (int j = s.length()-1; j> s.length()/2; j--) {
//				s1 = s1 + s.charAt(j);
//			}
//			
//			//check the strings being compared
//			System.out.println(s.substring(0, s.length()/2)  + " " + s1);
//			
//			
//			
//			
//			
//			if (s.substring(0, s.length()/2).equals(   s1     )) {
//			
//			System.out.println(s + " = ANAGRAM");}
//			
//			else {
//				System.out.println(s + " = NOT AN ANAGRAM");}
			
			
			if (l.equals(k)) {
				System.out.println(o + " = NOT AN ANAGRAM");
				continue;
			}
	
			for (int a = 0; a < k.length(); a++) {
				
				for (int b = 0; b < l.length(); b++) {
					
					//System.out.println(k.charAt(a) + " " +  l.charAt(b));
					if (k.charAt(a) == l.charAt(b)) {
						l = l.substring (0, b) + l.substring(b +1);
						continue;
					}
					else
						continue;
				}
				
				
			}
			
			if (l.length()==0) {
				System.out.println(o + " = ANAGRAM");}
			else
				System.out.println(o + " = NOT AN ANAGRAM");
			
			
			
		}

	}

}
