import java.util.*;
public class CFSoldier {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int k = input.nextInt();	//cost of first banana
		int n = input.nextInt();	//dollars in possession
		int w = input.nextInt();	//number of wanted bananas
		//int sum = 0;
		
		int sum = w * (w+ 1 )/2;
		
		int totalDollar = sum * k;
		
//		for (int i = 1; i <= w; i++) {
//			sum = sum + i*k;
//		}
		
		System.out.println(Math.max((totalDollar - n), 0));
		

	}

}
