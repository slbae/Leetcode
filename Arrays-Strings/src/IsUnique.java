import java.util.*;

/**
 * Determines if a given String contains all unique chars. Returns true or false.
 * There is a sorting and a HashSet approach to this question.
 * The time and space complexities of each approach is explained.
 * 
 * Updated: 6/13/2024
 * 
 * @author Sylbi Bae
 * 
 */
public class IsUnique {

    /**
     * Approach 1: HashSet
     * 
     * Time Complexity: O(n) bc n elements must be checked to determine is str is unique
     * 
     * Space Complexity: O(n) bc the HashSet may contain n elements if str is unique
     * 
     * Logic: Create HashSet, add all chars from string as we check if the char is already contained in Hashset
     * 
     * Solved 6/13/2024
     */
    public static boolean isUnique1(String str) {
        // Special Case: null str
        if (str == null) {
            return true;
        }

        // HashSet DS
        HashSet<Character> set = new HashSet<Character>();

        // Look for duplicate chars
        for (int i = 0; i < str.length(); i++) {
            if (set.contains(str.charAt(i))) {
                // Found char duplicate
                return false;
            }
            else {
                // Store unique char in HashSet
                set.add(str.charAt(i));
            }
        }
        
        return true;
        // Could also return set.size() == string.length() no need for duplicate checks
    }
    
    /**
     * Approach 2: Sorting
     * 
     * Time Complexity: O(nlogn) bc of Arrays.sort() (uses binary search insertion sort)
     * 
     * Space Complexity: O(1) bc an array of constant size is used
     * 
     * Logic: Convert string to a char array, sort, and check if adjacent elements
     *        are duplicates of each other
     * 
     * Solved 6/13/2024
     */
    public static boolean isUnique2(String str) {
        // Special Case: null str
        if (str == null) {
            return true;
        }

        // Convert to array to sort chars
        char[] arr = str.toCharArray();
        // Duplicate elements will be adjacent to each other
        Arrays.sort(arr);

        // Look for duplicate chars
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                // Found char duplicate
                return false;
            }
        }
        return true;
    }

}
