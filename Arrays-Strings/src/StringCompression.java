import java.util.*;

/**
 * Perform basic string compression using the counts of consecutive repeated characters (upper or lowercase letters, case-sensitive).
 * if the length of the compressed string is shorter than the original string, return the compressed string,
 * else return the original string.
 */
public class StringCompression {

    /**
     * Approach 1: StringBuilder
     * 
     * Time Complexity: O(n) bc we have to compress each char
     * 
     * Space Complexity: O()
     * 
     * Logic: Count number of consecutive chars in string and append the char and
     *        its number of consecutive occurrences to a stringbuilder (compressed string to return).
     * 
     * Date: 12/22/2024
     */
    public static String stringCompression1(String string) {
        // Base Case 1: Can't compress a null or empty string
        if (string == null || string.length() == 0) {
            return string;
        }

        // Convert the input string to a character array
        char[] arr = string.toCharArray();

        // Compressed version of the string
        StringBuilder compressed = new StringBuilder();

        // Count number of consecutive characters to append to compressed
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            // Found consecutive char
            if (arr[i] == arr[i - 1]) {
                count++;
            }
            else { // Found nonconsecutive char, append to compressed.
                compressed.append(arr[i - 1]);
                // Append the char's number of occurrences to compressed
                compressed.append(count);
                // Reset count for the next group of consecutive chars to compress
                count = 1;
            }
        }

        // Append the last char to compressed
        compressed.append(arr[arr.length - 1]);
        compressed.append(count);

        // If the compressed string is shorter than the original, return it, otherwise return the original string
        return compressed.length() < arr.length ? compressed.toString() : string;
    }

}
