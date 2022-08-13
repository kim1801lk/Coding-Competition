import java.util.*;
import java.io.*;

public class USACODontBeLast {

	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner (new FileReader("notlast.in"));
		PrintWriter out = new PrintWriter("notlast.out");
		
		String [] cowNames = {"Bessie" , "Elsie", "Daisy", "Gertie", "Annabelle", "Maggie", "Henrietta"};
		
		int []milk = new int [7];
		
		int n = in.nextInt();
		
		for (int i = 0; i < n; i++) {
			String currCow = in.next();
			int currMilk = in.nextInt();
			
			
			
			//adding milk amount to each cow
			for (int j = 0; j < 7; j++) {
				if (currCow.equals(cowNames[j])) {
					milk[j] += currMilk;
					break;
				}
			}
			
		}
		
		
		//sorting cows in ascending order
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j <6 ; j++) {
				if (milk[j] > milk [j+1]) {
					int temp1 = milk[j];
					milk[j] = milk[j+1];
					milk[j+1] = temp1;
					String temp2 = cowNames[j];
					cowNames[j]= cowNames[j+1];
					cowNames[j+1] =temp2;
					
				}
			}
		}
		
		int minMilk = milk[0];
		int ties = 1;
		
		
		
		for (int i = 1; i < 7; i++) {
			if (milk[i] != minMilk) {
				if (i+1 <7) {
					if (milk[i] == milk[i+1]) {
						out.println("Tie");
						break;
					}
					else {
						out.println(cowNames[i]);
						break;
					}
					
				}
				if (i == 6) {
					out.println(cowNames[i]);
					break;
				}
			}
			else
				ties++;
			
		}
		
		if (ties == 7)
			out.println("Tie");
		
		
		in.close();
		out.close();
	}

}
