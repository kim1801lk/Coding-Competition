import java.util.*;
public class CFWhiteSheet {

	
	//DOES NOT WORK
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		//white sheet
		int x1 = in.nextInt();
		int y1 = in.nextInt();
		int x2 = in.nextInt();
		int y2 = in.nextInt();
		
		
		//first black sheet
		int x3 = in.nextInt();
		int y3 = in.nextInt();
		int x4 = in.nextInt();
		int y4 = in.nextInt();
		
		//second black sheet
		int x5 = in.nextInt();
		int y5 = in.nextInt();
		int x6 = in.nextInt();
		int y6 = in.nextInt();

		int whitePaperArea = (y2-y1) * (x2-x1);
	
		
		//neither paper intersects white paper
		if (y2 <= y3 || y1 >= y4 || x1 >= x4 || x2 <= x3 ) 
			if (y2 <= y5 || y1 >= y6 || x1 >= x6 || x2 <= x5) 
			System.out.println("YES");
		
		//at least one of them intersect
		else {
			if (intersect(x1, y1, x2, y2, x3, y3, x4, y4)) {
				
				int width = Math.min(x2, x4) - Math.max(x1, x3);
				int length = Math.min(y2, y4) -  Math.max(y1, y3);
				
				whitePaperArea = whitePaperArea - (width *length);
			
				System.out.println(whitePaperArea);
			}
			
			if (intersect(x1, y1, x2, y2, x5, y5, x6, y6)) {
				
				int width = Math.min(x2, x6) - Math.max(x1, x5);
				int length = Math.min(y2, y6) -  Math.max(y1, y5);
				
				whitePaperArea = whitePaperArea - (width * length);
				
			}
			
			
			
		}
		
		if (whitePaperArea > 0)
			System.out.println("YES");
		else
			System.out.println("NO");
			
		
			
			
	}
	

	public static boolean intersect(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		/*
		 * return true if they intersect
		 */
		
		if (y2 <= y3 || y1 >= y4 || x1 >= x4 || x2 <= x3)
			return false;
		else 
			return true;
		
	}

}
