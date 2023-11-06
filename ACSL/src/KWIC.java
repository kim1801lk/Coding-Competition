import java.util.HashSet;
import java.util.regex.Pattern;
import java.util.*;

public class KWIC {
    public static void main(String[] args) {
        String firstString = "KWIC is an acronym for Key Word In Context, the most common format for concordance lines which is used for indexing in context.";
        String secondString = "for in the";

        String difference = getWordDifference(firstString, secondString);
     
        
        
        
        String[] words = alphabetizeWords(difference).split(" ");
      
        
        String [] originalSentence = firstString.split(" ");
        
        
        
       
        
        
        
        
        
        for (int i = 0; i < words.length; i++) {
        	
        	int index  = 0;
        	for (int a = 0; a < originalSentence.length; a++) {
        		
        		
        		if (words[i].equals (originalSentence[a])) {
        			index = a;
        			break;
        		}
        		else {
        			continue; 
        		}
        		
        		
        		
        		

        	}
        	
        	
        	for (int b = index-1; b > index - 3 && b > -1; b--) {
        		if (!containsPunctuation(originalSentence[b])) {
        			
        			if (!secondString.contains(originalSentence[b]))
        			words[i] = originalSentence[b] + " " +  words[i];
        			else
        				break;
        		}
        	}
        	
        	for (int c = index+1; c < originalSentence.length && c < index +3; c++) {
        		if (!containsPunctuation(originalSentence[c])) {
        			if (!secondString.contains(originalSentence[c]))
        		 
        				words[i] =  words[i] + " " + originalSentence[c];
        			else
        				break;
        		}
        	}
        	index = 0;
        	        	
        	
        	
        }
        
        for (int i = 0; i < words.length; i++) {
        	System.out.println(words[i]);
        }
        
        
    }

    public static String getWordDifference(String firstString, String secondString) {
        // Split the first and second strings into individual words
        String[] firstWords = firstString.split("\\s+");
        String[] secondWords = secondString.split("\\s+");

        StringBuilder difference = new StringBuilder();

        // Create a set of words from the second string for faster lookup
        HashSet<String> secondSet = new HashSet<>();
        for (String word : secondWords) {
            secondSet.add(word.toLowerCase());
        }

        // Check each word in the first string
        for (String word : firstWords) {
            // Remove punctuation marks from the word
            String cleanedWord = word.replaceAll("\\p{Punct}", "");

            // Skip the word if it exists in the second string or if it's empty after removing punctuation
            if (secondSet.contains(cleanedWord.toLowerCase()) || cleanedWord.isEmpty()) {
                continue;
            }

            // Add the word to the difference string
            difference.append(cleanedWord).append(" ");
        }

        return difference.toString().trim();
    }
    
    public static String alphabetizeWords(String inputString) {
        // Split the input string into individual words
        String[] words = inputString.split("\\s+");

        // Sort the words alphabetically
        Arrays.sort(words, String.CASE_INSENSITIVE_ORDER);

        // Join the sorted words back into a string
        String alphabetizedString = String.join(" ", words);

        return alphabetizedString;
    }
    
 

        public static boolean containsPunctuation(String inputString) {
            String punctuationRegex = "\\p{Punct}";
            return inputString.matches(".*" + punctuationRegex + ".*");
        }
    
    
    
    
}
