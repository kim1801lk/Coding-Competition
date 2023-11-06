import java.util.*;

public class prob02_2022 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int T = Integer.parseInt(in.nextLine());
		
		for (int i = 0; i < T; i++) {
			int volume = in.nextInt();
			int enter = in.nextInt();
			int leave = in.nextInt();
			
			System.out.println(volume / (enter-leave) * leave);
		}
			
			

	}

}
