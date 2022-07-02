import java.io.*;
import java.util.*;

public class USACOCircularBarn {

	public static void main(String[] args) throws IOException {
		

		Scanner in = new Scanner (new FileReader ("cbarn.in"));
		PrintWriter out = new PrintWriter ("cbarn.out");
		
		int rooms = in.nextInt();
		
		ArrayList<Integer> roomCap = new ArrayList<Integer>();
		
		for (int i = 0; i < rooms; i++) {
			roomCap.add(in.nextInt());
		}
		
		//first time to set distance 
		int distance = 0;
		int switchRoom = roomCap.get(0);
		for (int i = 1; i < rooms; i++) {
			distance = distance + roomCap.get(i) * i;
		}
		
		roomCap.remove(0);
		roomCap.add(switchRoom);
		
	
		int currDistance = 0;
		//rest of the cases
		for (int rotation = 0; rotation < rooms -1; rotation++) {
			
			switchRoom = roomCap.get(0);
			
			for (int i = 1; i < rooms; i++) {
				currDistance = currDistance + roomCap.get(i) * i;
			}
			
			distance = Math.min(distance, currDistance);
			
			//out.println(roomCap);
			roomCap.remove(0);
			roomCap.add(switchRoom);
			currDistance = 0;
		}
		
		out.println(distance);
		
		in.close();
		out.close();
	}

}
