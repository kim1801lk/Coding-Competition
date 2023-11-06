
public class finalfinal {

	public static void main(String[] args) {
		

		int []arr = {5, 8, 6, 2, 9, 3, 7, 0, 1, 4};
		int count = 0;
		
		for (int x = 0; x < 9; x++) {
			for (int y = x +1; y <10; y++) {
				if (x == arr[y]) {
					int z1 = x;
					int z2 = y;
					while (z1<z2) {
						int t = arr[z1];
						arr[z1] = arr[z2];
						arr[z2] = t;
						count = count + 1;
						z1= z1+1;
						z2 = z2-1;
					}
				}
			}
		}
		
		System.out.println(count);

	}

}
