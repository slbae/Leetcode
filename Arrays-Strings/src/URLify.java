import java.util.*;

/**
 * Replace all spaces in a String with ‘%20’.
 * 
 */
public class URLify {
    
    /**
     * Approach 1: In-place replacement
     * 
     * Time Complexity: O(n) bc we must check each element for spaces
     * 
     * Space Complexity: O(1) bc fixed size arrays
     * 
     * Logic: Count how many spaces are in str then create a larger array to replace spaces with %20.
     * 
     * Solved 6/16/2024
     */
    public static String urlify1(String str) {
        char[] arr = str.toCharArray();

        // Count number of spaces in str
        int spaces = 0;
        for (char c : arr) {
            if (c == ' ') {
                spaces++;
            }
        }

        // Calculate new array length with more space for %20s
        int newLen = arr.length + spaces * 2;
        char[] newArr = new char[newLen];

        // In-place replacement with two pointers for both arrays
        int j = arr.length - 1;
        for (int i = newArr.length - 1; i >= 0 && j >= 0; i--) {
            if (arr[j] == ' ') {
                newArr[i] = '0';
                newArr[i - 1] = '2';
                newArr[i - 2] = '%';
                //Skip over %20 we added
                i -= 2;
                j--;
            }
            else {
                newArr[i] = arr[j--];
            }
        }

        String s = new String(newArr);
        return s;
    }

}
