import java.util.*;

/**
 * Determine if a String is a permutation of a palindrome. Ignore casing and non-letter chars.
 * A palindrome is a String that is the same forwards and backwards. A permutation is a
 * rearrangement of chars in a String.
 */
public class PalindromePermutation {

    /**
     * Approach 1: ASCII array
     * 
     * Time Complexity: O(n) bc we must check n elements
     * 
     * Space Complexity: O(1) bc fixed size arrays
     * 
     * Logic: Create an ASCII array for letters (length 26), increment for each letter occurrence,
     *        ensure there is one or zero odd #s in the array (meaning all chars are in a pair except
     *        for maybe one if str has an odd length), then return odd < 2
     * 
     * Solved 6/16/2024
     */
    public static boolean palindromePermutation1(String str) {
        String s = str.toLowerCase();
        // Only count letters
        int[] count = new int[26];

        // Count occurrences of only letters in str
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isLetter(s.charAt(i))) {
                continue;
            }
            count[s.charAt(i) - 'a']++;
        }

        // It is a palindrome permutation if there is < 2 odd occurrences
        int odds = 0;
        for (int i : count) {
            if (i % 2 == 1) {
                odds++;
            }
        }

        return odds < 2;
    }

     /**
     * Approach 2: HashMap
     * 
     * Time Complexity: O(n) bc we must check n elements
     * 
     * Space Complexity: O(n) bc HashMap has n entries
     * 
     * Logic: Put entries to HashMap <char, # occurrences of char>, determine how many
     *        occurrences are odd (meaning they are not in a pair), then return oddCount < 2
     * 
     * Solved 6/16/2024
     */
    public static boolean palindromePermutation2(String str) {
        String s = str.toLowerCase();
        // <character, # occurrences>
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        // Fill map with only letters in str
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isLetter(s.charAt(i))) {
                continue;
            }
            if (map.get(s.charAt(i)) != null) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
            else {
                map.put(s.charAt(i), 1);
            }    
        }

        // It is a palindrome permutation if there is < 2 odd occurrences
        int odds = 0;
        for (int i : map.values()) {
            if (i % 2 == 1) {
                odds++;
            }
        }

        return odds < 2;
    }

    /**
     * Approach 3: ASCII array (unassisted implementation of approach 1)
     * 
     * Time Complexity: O(n) bc we must check n elements
     * 
     * Space Complexity: O(1) bc fixed array
     * 
     * Logic: Same as palindromePermutation1
     * 
     * Solved 12/20/2024
     */
    public static boolean palindromePermutation3(String string) {
        // Base Case 1: Null string is not a permutation
        if (string == null) {
            return false;
        }

        // Ignore casing and non letter chars
        String s = string.toLowerCase();
        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                count[s.charAt(i) - 'a']++;
            }
        }

        int unique = 0;
        for (int i : count) {
            if (i % 2 != 0) {
                unique++;
            }
        }

        return unique < 2;
    }

}
