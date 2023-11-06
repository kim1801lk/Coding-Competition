import java.util.Arrays;

public class contest4 {

	public static void main(String[] args) {
		
		
		int size = 5;
		String targets = "31 21 13 32 11 12";
				
				
				
				// size is the size of the grid
				 //targets is a string 
				        
				        
				    
	 //2 d array with all 0s 
				    int[][] arr = new int[size][size];

				    for (int i = 0; i < size; i++) {
				        for (int j = 0; j < size; j++) {
				            arr[i][j] = 0;
				        }
				    }
				    
	//at target positions put 1
				    
			//make targetLocations for each target position
				    
				    String[] targetStrings = targets.split(" ");
				    int[][] targetLocations = new int[targetStrings.length][2];
				    for (int i = 0; i < targetStrings.length; i++) {
				        targetLocations[i][0] = Integer.parseInt(targetStrings[i].substring(0, 1));
				        targetLocations[i][1] = Integer.parseInt(targetStrings[i].substring(1));
				    }

//				    this prints out what's in target locations
//				    for (int i = 0; i < 5; i++) {
//				        for (int j = 0; j < 2; j++) {
//				            System.out.print(targetLocations[i][j]);
//				        }
//				        System.out.println();
//				    }
				    // it's a 5 x 2 array max
				    //[   ] 
				    //[   ] 
				    //[   ] 
				    //[   ] 
				    //[   ] 
				    //
				    
				    //make positions of target in 2D array 1
				    
				    for (int i = 0; i < targetStrings.length; i++) {
				    	
							
							arr[targetLocations[i][0]][targetLocations[i][1]] = 1;
				    		
				    }
				    
				    
				    
				    //prints the 2D array
//				    for (int i = 0; i < arr.length;i++) {
//				    	for (int j = 0; j < arr.length; j++) {
//				    		System.out.print(arr[i][j]);
//				    	}
//				    	System.out.println();
//				    }
				    
				    
				    
//start at each target position and go to either [0][x], [size-1][x], [x][0], or [x][size-1] 
				 //without ever hitting an element with 1 then increase hit number by one
				    
				    int [] reach = new int [targetLocations.length];
				    
				    
				    for (int i = 0; i < targetLocations.length; i ++) {
				    	 
				    	int h = 0;
				    	int r = targetLocations[i][0];
				    	int c = targetLocations[i][1];
				    
				    	//System.out.println(r + " " + c);
				    	//moving up
				    	
				    	if (checkUp(arr, r, c)) {
				    		h++;
				    	}
	 	
				    	//moving right
				    	
				    	if (checkRight(arr, r, c)) {
				    		h++;
				    	}
				    	
				    	//moving down
				    	if (checkBottom(arr, r, c)) {
				    		h++;
				    	} 
				    	
				    	//moving left
				    	if (checkLeft(arr, r, c)) {
				    		h++;
				    	} 
				    	
				    	if (checkRightUpDiagonal(arr, r, c)) {
				    		h++;
				    	} 
				    	
				    	if (checkRightDownDiagonal(arr, r, c)) {
				    		h++;
				    	} 
				    	
				    	if (checkLeftDownDiagonal(arr, r, c)) {
				    		h++;
				    	} 
				    	if (checkLeftUpDiagonal(arr, r, c)) {
				    		h++;
				    	}
				    	
				    	
				    	
				    	
				    	
				    	reach[i] = h;
				    	h = 0;
				    	
				    }//end of checking all directions of one target
				    
				   
				int max = findMax(reach);
				
				   String ans = ""; 
				
				   int [] answers = new int [targetLocations.length];
				   
				for (int i = 0; i < targetLocations.length; i++) {
					
					
			
						if (max == reach [i]) {
							
							answers[i] = targetLocations[i][0] * 10 + targetLocations[i][1];
					}
					
					
				}
				
				 
				
				Arrays.sort(answers);
				
				
				for (int i = 0; i < targetLocations.length; i++) {
					
					if (ans.length() == 0) {
						if (answers[i] != 0) {
							
							
							ans = ans + Integer.toString (answers[i]);
						}
					}
					else if (ans.length() != 0) {
						if (answers[i] != 0) {
						ans = ans + " " +  Integer.toString (answers[i]);}
					}
				}
				
				System.out.println(ans);
				
				
				 
		

	}

	
	public static boolean checkUp(int[][] arr, int startX, int startY) {
	    // iterate from starting point up to top edge
	    for (int i = startX-1; i >= 0; i--) {
	        if (arr[i][startY] != 0) { // if value is not zero, return false
	            return false;
	        }
	    }
	    // if all values up to top edge are 0s, return true
	    return true;
	}
	
	public static boolean checkRight(int[][] arr, int startX, int startY) {
	    // iterate from starting point right to right edge
	    for (int j = startY; j < arr[0].length-1; j++) {
	        if (arr[startX][j+1] != 0) { // if value is not zero, return false
	            return false;
	        }
	    }
	    // if all values right to right edge are 0s, return true
	    return true;
	}
	
	public static boolean checkBottom(int[][] arr, int startX, int startY) {
	    // iterate from starting point down to bottom edge
	    for (int i = startX; i < arr.length-1; i++) {
	        if (arr[i+1][startY] != 0) { // if value is not zero, return false
	            return false;
	        }
	    }
	    // if all values down to bottom edge are 0s, return true
	    return true;
	}
	
	public static boolean checkLeft(int[][] arr, int startX, int startY) {
	    // iterate from starting point left to left edge
	    for (int j = startY-1; j >= 0; j--) {
	        if (arr[startX][j] != 0) { // if value is not zero, return false
	            return false;
	        }
	    }
	    // if all values left to left edge are 0s, return true
	    return true;
	}
	
	public static boolean checkRightUpDiagonal(int[][] arr, int startX, int startY) {
	    int j = startY + 1; // start from next column to the right of the starting point
	    // iterate from starting point diagonally right and up to right diagonal edge
	    for (int i = startX - 1; i >= 0 && j < arr[0].length; i--, j++) {
	        if (arr[i][j] != 0) { // if value is not zero, return false
	            return false;
	        }
	    }
	    // if all values diagonally right and up to right diagonal edge (excluding starting point) are 0s, return true
	    return true;
	}
	
	public static boolean checkRightDownDiagonal(int[][] arr, int startX, int startY) {
	    int i = startX + 1; // start from next row below the starting point
	    int j = startY + 1; // start from next column to the right of the starting point
	    // iterate from starting point diagonally right and down to right down diagonal edge
	    for (; i < arr.length && j < arr[0].length; i++, j++) {
	        if (arr[i][j] != 0) { // if value is not zero, return false
	            return false;
	        }
	    }
	    // if all values diagonally right and down to right down diagonal edge (excluding starting point) are 0s, return true
	    return true;
	}
	
	public static boolean checkLeftDownDiagonal(int[][] arr, int startX, int startY) {
	    int i = startX + 1; // start from next row below the starting point
	    int j = startY - 1; // start from next column to the left of the starting point
	    // iterate from starting point diagonally left and down to left down diagonal edge
	    for (; i < arr.length && j >= 0; i++, j--) {
	        if (arr[i][j] != 0) { // if value is not zero, return false
	            return false;
	        }
	    }
	    // if all values diagonally left and down to left down diagonal edge (excluding starting point) are 0s, return true
	    return true;
	}
	
	public static boolean checkLeftUpDiagonal(int[][] arr, int startX, int startY) {
	    int i = startX - 1; // start from previous row above the starting point
	    int j = startY - 1; // start from previous column to the left of the starting point
	    // iterate from starting point diagonally left and up to left up diagonal edge
	    for (; i >= 0 && j >= 0; i--, j--) {
	        if (arr[i][j] != 0) { // if value is not zero, return false
	            return false;
	        }
	    }
	    // if all values diagonally left and up to left up diagonal edge (excluding starting point) are 0s, return true
	    return true;
	}
	
	public static  int findMax(int[] arr) {
	    int max = arr[0]; // assume first element is maximum
	    for (int i = 1; i < arr.length; i++) {
	        if (arr[i] > max) { // if current element is greater than max, update max
	            max = arr[i];
	        }
	    }
	    return max;
	}
	
	
	
	
}
