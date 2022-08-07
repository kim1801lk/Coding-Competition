import java.util.*;
import java.io.*;

public class USACOWDCCR3 {

	public static void main(String[] args) throws IOException{
		



		Scanner in = new Scanner (new FileReader("cowqueue.in"));
		PrintWriter out = new PrintWriter("cowqueue.out");
		
		
		int cows = in.nextInt();
		
		int [] arrival = new int [cows];
		int [] interview = new int [cows];
		
		for (int i = 0; i < cows; i++) {
			
			arrival[i] = in.nextInt();
			interview [i] = in.nextInt();
			
		}
		
		
		for (int i = 0; i < cows; i++) {
			for (int j = 0; j < cows -1; j++) {
				if (arrival[j] > arrival[j+1]) {
					int temp1 = arrival[j];
					arrival[j] = arrival[j+1];
					arrival[j+1] = temp1;
					int temp2 = interview [j];
					interview[j] = interview[j+1];
					interview[j+1] = temp2;
					
				}
			}
		}
		
		
		//int endtime = arrival[0];
		int currTime = arrival[0] + interview[0];
		
		for(int i = 1; i < cows; i++) {
			
			if(currTime < arrival[i]) {
				currTime = arrival[i]  + interview[i];
			}
			else if (currTime >= arrival[i]) {
				currTime = currTime + interview[i];
			}
		
		}
		//System.out.println(currTime);
		out.println(currTime);
		
		in.close();
		out.close();
	}
	
}


