
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
//import java.util.*;
public class USACOword {

	public static void main(String[] args)throws IOException {
		
		
		BufferedReader in = new BufferedReader(new FileReader("word.in"));
		PrintWriter out = new PrintWriter("word.out");
		
		
		String [] input = in.readLine().split(" ");
		int numWords = Integer.parseInt(input [0]);
		int numChar = Integer.parseInt(input [1]);
		

		
		String [] essay = in.readLine().split(" ");
		
		int currChar = 0;
		
		String line = "";
		String temp = "";
		
		for (int i = 0; i < essay.length; i++) {
			
			temp += essay[i];
			
			if (temp.length() <= numChar) {
				line += essay[i] + " ";
			}
			
			else {
				line = line.substring(0,line.length() - 1);
				line += "\n"; 
				temp = "";
				i--;
			}	
		
		
		}
		
		out.print(line.substring(0, line.length()-1));
		
		in.close();
		out.close();
		

	}

}
