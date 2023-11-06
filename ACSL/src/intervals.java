import java.util.*;
public class intervals {

	public static void main(String[] args) {
		
		String intervals1 = "(2,6) (13,17) (6,9) (9,13) (0,2)";
		String intervals2 =  "[15,18] [0,5] [6,14]";
		String intervals3 =  "(11,14] [3,4) (6,10] [5,5]";
		
		
		
		
		String[] set1 = intervals1.split(" ");
		String[] set2 = intervals2.split(" ");
		String[] set3 = intervals3.split(" ");
		
		ArrayList<Integer> s1 = new ArrayList<>();
		for (int i = 0; i < set1.length; i++) {
			s1.addAll( getIntervalList(set1[i]));
		}
		
		ArrayList<Integer> s2 = new ArrayList<>();
		for (int i = 0; i < set2.length; i++) {
			s2.addAll( getIntervalList(set2[i]));
		}
		
		ArrayList<Integer> s3 = new ArrayList<>();
		for (int i = 0; i < set3.length; i++) {
			s3.addAll( getIntervalList(set3[i]));
		}
		
		ArrayList<Integer> count1 = new ArrayList<>();
		ArrayList<Integer> count2 = new ArrayList<>();
		
		
		int count = 1;
		
	
			
			
			for (int a = 0; a < s1.size(); a++) {
				int num = s1.get(a);
				
				if (s2.contains(num)) {
					count++;
				}
				if (s3.contains(num)) {
					count++;
				}
				
				if (count == 1) {
					if (!count1.contains(num))
						count1.add(num);
				}
				
				if (count == 2) {
					if (!count2.contains(num))
						count2.add(num);
				}
				
				count = 1;
			}
			
			for (int a = 0; a < s2.size(); a++) {
				int num = s2.get(a);
				
				if (s1.contains(num)) {
					count++;
				}
				if (s3.contains(num)) {
					count++;
				}
				
				if (count == 1) {
					if (!count1.contains(num))
						count1.add(num);
				}
				
				if (count == 2) {
					if (!count2.contains(num))
						count2.add(num);
				}
				
				count = 1;
			}
			
			for (int a = 0; a < s3.size(); a++) {
				int num = s3.get(a);
				
				if (s2.contains(num)) {
					count++;
				}
				if (s1.contains(num)) {
					count++;
				}
				
				if (count == 1) {
					if (!count1.contains(num))
						count1.add(num);
				}
				
				if (count == 2) {
					if (!count2.contains(num))
						count2.add(num);
				}
				
				count = 1;
			}

		
			int sum1 = 0;
			for (int i = 0; i < count1.size(); i++) {
				sum1= sum1 + count1.get(i);
			}
			
			int sum2 = 0;
			for (int i = 0; i < count2.size(); i++) {
				sum2= sum2 + count2.get(i);
			}
				
				System.out.println(sum1);
				
				System.out.println(sum2);
			
		
	}
	
	
	  public static ArrayList<Integer> getIntervalList(String intervalString) {
	        ArrayList<Integer> intervalList = new ArrayList<>();

	        // Remove any whitespace characters from the interval string
	        intervalString = intervalString.replaceAll("\\s+", "");
	       
	       

	        // Extract the start and end values from the interval string
	        int start = Integer.parseInt(intervalString.substring(1,
	                intervalString.indexOf(',')));
	        int end = Integer.parseInt(intervalString.substring(intervalString.indexOf(',') + 1, intervalString.length()-1));

	        // Determine the inclusive/exclusive nature of the interval
	        boolean includeStart = intervalString.charAt(0) == '[';
	        boolean includeEnd = intervalString.charAt(intervalString.length() - 1) == ']' ;

	        // Add the integers within the interval to the list
	        for (int i = start; i <= end; i++) {
	            if ((i == start && !includeStart) || (i == end && !includeEnd)) {
	                continue; // Skip the start or end value if it's excluded
	            }
	            intervalList.add(i);
	        }

	        return intervalList;
	  }
	  
	  
	  
	 
		
	  /*
	   * String[] set1 = intervals1.split(" ");
		String[] set2 = intervals2.split(" ");
		String[] set3 = intervals3.split(" ");
		
		ArrayList<Integer> s1 = new ArrayList<>();
		for (int i = 0; i < set1.length; i++) {
			s1.addAll( getIntervalList(set1[i]));
		}
		
		ArrayList<Integer> s2 = new ArrayList<>();
		for (int i = 0; i < set2.length; i++) {
			s2.addAll( getIntervalList(set2[i]));
		}
		
		ArrayList<Integer> s3 = new ArrayList<>();
		for (int i = 0; i < set3.length; i++) {
			s3.addAll( getIntervalList(set3[i]));
		}
		
		ArrayList<Integer> count1 = new ArrayList<>();
		ArrayList<Integer> count2 = new ArrayList<>();
		
		
		int count = 1;
		
	
			
			
			for (int a = 0; a < s1.size(); a++) {
				int num = s1.get(a);
				
				if (s2.contains(num)) {
					count++;
				}
				if (s3.contains(num)) {
					count++;
				}
				
				if (count == 1) {
					if (!count1.contains(num))
						count1.add(num);
				}
				
				if (count == 2) {
					if (!count2.contains(num))
						count2.add(num);
				}
				
				count = 1;
			}
			
			for (int a = 0; a < s2.size(); a++) {
				int num = s2.get(a);
				
				if (s1.contains(num)) {
					count++;
				}
				if (s3.contains(num)) {
					count++;
				}
				
				if (count == 1) {
					if (!count1.contains(num))
						count1.add(num);
				}
				
				if (count == 2) {
					if (!count2.contains(num))
						count2.add(num);
				}
				
				count = 1;
			}
			
			for (int a = 0; a < s1.size(); a++) {
				int num = s3.get(a);
				
				if (s2.contains(num)) {
					count++;
				}
				if (s1.contains(num)) {
					count++;
				}
				
				if (count == 1) {
					if (!count1.contains(num))
						count1.add(num);
				}
				
				if (count == 2) {
					if (!count2.contains(num))
						count2.add(num);
				}
				
				count = 1;
			}

		
			int sum1 = 0;
			for (int i = 0; i < count1.size(); i++) {
				sum1= sum1 + count1.get(i);
			}
			
			int sum2 = 0;
			for (int i = 0; i < count2.size(); i++) {
				sum2= sum2 + count2.get(i);
			}
		
	   */
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}


