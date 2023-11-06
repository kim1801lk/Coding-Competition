import java.util.*;

public class prob04 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int n = in.nextInt();
		
		String a = in.nextLine();
		String b = "";
		for (int i = 0; i < n; i++) {
			b = in.nextLine() + "\n" + a;
			a = b;
		}

		System.out.println(b);
	}

}
