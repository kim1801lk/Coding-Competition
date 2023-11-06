import java.util.*;
import java.lang.Object;
import java.util.regex.Pattern;

import java.util.regex.Matcher;

public class prob04_2022 {

	public static void main(String[] args) {
		
Scanner in = new Scanner (System.in);
		
		int T = Integer.parseInt(in.nextLine());
		
		for (int i = 0; i < T; i++) {
			
		String s = in.nextLine();
		
		Pattern pattern = Pattern.compile("[^a-z A-Z 0-9]");
	    Matcher matcher = pattern.matcher(s);
	    String number = matcher.replaceAll("");
    
	    
	    System.out.println(number);
		}

	}

}
