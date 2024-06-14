import java.util.*;

/**
 * Returns true if str1 is a permutation of str2. A permutation of a string is another string
 * that contains the same characters, only the order of characters can be different.
 * There is a sorting and an ASCII array approach to this question.
 * The time and space complexities of each approach is explained.
 * 
 * Updated: 6/13/2024
 * 
 * @author Sylbi Bae
 * 
 */
public class IsPermutation {
    
    /**
     * Approach 1: Sorting
     * 
     * Time Complexity: O(nlogn) bc of Arrays.sort()
     * 
     * Space Complexity: O(1) bc of fixed size arrays
     * 
     * Logic: Convert both strings to arrays, sort them, then check if they're equal arrays
     * 
     * Solved 6/13/2024
     */
    public static boolean isPermutation1(String str1, String str2) {
        // Special Case: null strings
        if (str1 == null || str2 == null) {
            return false;
        }

        // Convert strings to arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort the arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    /**
     * Approach 2: ASCII Array
     * 
     * Time Complexity: O(n) bc we are iterating through both strings
     * 
     * Space Complexity: O(1) bc of fixed size array
     * 
     * Logic: Keep track of the frequencies of each char in both strings.
     *        Increment for one string, decrement for the other.
     *        If they are permutations of each other, the ASCII array should only contain 0s and both string lengths should be the same. 
     * 
     * Solved 6/13/2024
     */
    public static boolean isPermutation2(String str1, String str2) {
         // Special Case: null strings
         if (str1 == null || str2 == null) {
            return false;
        }

        // This array's size is constant so O(1) time complexity to iterate through it
        int[] count = new int[128];

        // Store frequencies of chars in both strings in count array
        for (int i = 0; i < str1.length() && i < str2.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        // If count is still zeroed out, that means the strings canceled each other out
        // and they are permutations of each other
        for (int i : count) {
            if (i != 0) {
                return false;
            }
        }

        // Ensure both strings are the same length
        return str1.length() == str2.length();
    }

}
