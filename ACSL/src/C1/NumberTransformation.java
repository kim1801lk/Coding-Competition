package C1;
import java.util.*;
public class NumberTransformation {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int n = in.nextInt();
		int p = in.nextInt();
		
		ArrayList <Integer> number = new ArrayList<>();
		
		int middle = (int) (n / Math.pow(10, p-1)) % 10;
		
		
		String temp = Integer.toString(n);
		int[] digits = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++) {
		    digits[i] = temp.charAt(i) - '0';
		}
		
		
		
		for (int i = 0; i < digits.length - p; i++) {
			number.add((digits[i] + middle) % 10);
		}
		
		number.add(middle);
		
		for (int i = digits.length - p + 1; i < digits.length; i++) {
			number.add(Math.abs(middle-digits[i]));
		}

		for (int i = 0; i < number.size(); i++) {
			System.out.print(number.get(i));
		}
		
	}

}
