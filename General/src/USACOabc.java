import java.util.*;
public class USACOabc {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		
		int [] nums = new int [7];
		
		for (int i =0; i < 7;i++) {
			nums [i] = input.nextInt();
		}
			
		Arrays.sort(nums);
		
		
		
		System.out.printf("%d %d %d", nums [0], nums[1], nums[6] - nums[0] - nums[1]);
		
		

	}

}
