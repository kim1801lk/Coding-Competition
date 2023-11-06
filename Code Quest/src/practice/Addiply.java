package practice;

import java.util.*;

public class Addiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		
		for (int i = 0; i <n; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			
			System.out.println(a+b + " " + a*b);
			
		}
		
	}

}
