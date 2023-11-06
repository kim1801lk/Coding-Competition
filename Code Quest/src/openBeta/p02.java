package openBeta;

import java.util.Scanner;

public class p02 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int E = in.nextInt();
		int M = in.nextInt();
		
		System.out.println(E * M);
		
		if (E*M>500000)
			System.out.println("Too Many Bugs! Abandon Game!!");

	}

}
