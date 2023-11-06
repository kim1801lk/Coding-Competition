
public class acsl3_1 {

	public static void main(String[] args) {
		
		String input = "BINARYSEARCHTREE";
		  int n = input.length();
        char[] letters = new char[n];
        int[] values = new int[n];

        
        // Step 1: Insert each letter into the first array in alphabetical order and assign value
        
        letters[0] = input.charAt(0);
        values[0] = 0;

        
        
        //PART A: CREATING ARRAY
        for (int i = 1; i < n; i++) {
            char c = input.charAt(i);
            int j = i - 1;
                 
            
            int d;
            boolean duplicate = false;
            for (d = 0; d < letters.length; d++ ) {
          	  if (c == letters[d]) {
          		  duplicate = true;
          		  break;
          	  }
          	  
            }
            
            
        
            
           if (duplicate) {
          	 for (int x = letters.length - 2; x >= d; x--) {
                   letters[x + 1] = letters[x];
                   values[x+1] = values [x];
               }
               letters[d] = c;
               if (d == 0) {
              	 values[0] = values [1] +1;
               }
               else if (d == letters.length-1) {
              	 values[d] = values [d-1] + 1;
               }else {
              	 values[d] = Math.max(values[d-1], values[d+1]) + 1;
               }
               continue;
               
           }
            
            else { 
          	  while (j >= 0 && letters[j] > c) {
                
                if (letters[j] == c)
              	  break;
                
                letters[j+1] = letters[j];
                values[j+1] = values[j];
                j--;
            }
            letters[j+1] = c;
            }
            
            
            //assigning value
            if (i == 0){
                values [j+1] = 0;
                continue;
            }
            if (j+1 == 0){
            values[j+1] = values[j+2]+1; 
            }
            else if (j+1== i){
                values [j+1] = values[j]+1;
            }
            else{
                values[j+1] = values[j]+1;
                if (values[j+1] <= values[j+2]){
                values [j+1] = values [j+2]+1;
                }
            }
            
            
            
            
            
        } //END OF CREATING ARRAYS
        
        
        
        
        String leftString = "";
        String rightString = "";

        //making strings
        
        for (int i = 0; i < values.length; i++) {
        	
        	int currNum = values[i];
        	//first letter
        	if (i == 0) {
        		if (values[i+1] > currNum) {
        			rightString = rightString + letters[0];
        			continue;
        		}
        	}
        	//last letter
        	else if (i == values.length - 1) {
        		if (values[i - 1] > currNum ) {
        			leftString = leftString + letters[i];
        			continue;
        		}
        	}
        	
        	else if (values[i + 1] > currNum ) {
        		if (values[i - 1] <= currNum ) {
        			rightString = rightString + letters[i];
        		}
        	}
        	
        	else if (values[i - 1] > currNum ) {
        		if (values[i + 1] <= currNum) {
        			leftString = leftString + letters[i];
        		}
        	}
        	
        	
 
        }
        
        
        System.out.println("\nleft string: " + leftString);
        System.out.println("Right string: " + rightString);
        

	}


}
