package problemOne;
import java.util.HashSet;
import java.util.Scanner;

public class LongestUniqueSubstring {


		    public static String longestUniqueSubstring(String input) {
		    	 if (input == null || input.isEmpty()) {
		             return "Input is required";
		         }

		         char[] chars = input.toCharArray();
		         int left = 0, maxLength = 0, startIndex = 0;
		         HashSet<Character> seen = new HashSet<>();

		         for (int right = 0; right < chars.length; right++) {
		             while (seen.contains(chars[right])) {
		                 seen.remove(chars[left]);
		                 left++;
		             }
		             seen.add(chars[right]);

		             if (right - left + 1 > maxLength) {
		                 maxLength = right - left + 1;
		                 startIndex = left;
		             }
		         }

		         String longestSubstring = input.substring(startIndex, startIndex + maxLength);
		         return "Length: " + maxLength + ", Substring: '" + longestSubstring + "'";
		     }

		     public static void main(String[] args) {
		         Scanner scanner = new Scanner(System.in);
		         System.out.print("Enter a string (lowercase only): ");
		         String userInput = scanner.nextLine();
		         System.out.println(longestUniqueSubstring(userInput));
		         scanner.close();
		    }
		

	}


