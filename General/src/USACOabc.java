import java.util.*;
public class USACOabc {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		
		ArrayList <Integer> numbers = new ArrayList <Integer>();
		
		for (int i =0; i < 7;i++) {
			numbers.add(input.nextInt());
		}
			
		int a = numbers.get(0);
		int indexA = 0;
		for (int i =1; i < 7;i++) {
			int num = numbers.get(i);
			if (num < a) {
				a = num;
				indexA = i;
				}
		}
		numbers.remove(indexA);
		
		
		
		int b = numbers.get(0);
		int indexB = 0;
		for (int i =1; i < 6;i++) {
			int num = numbers.get(i);
			if (num < b) {
				b = num;
				indexB = i;
			}
		}
		numbers.remove(indexB);
		
		
		int c = numbers.get(0);
	
		for (int i =1; i < 5;i++) {
			int num = numbers.get(i);
			if (num < c) {
				if (num != a + b) {
				c = num;
				
			}}
		}
		
		System.out.printf("%d %d %d", a, b, c);
		
		

	}

}
