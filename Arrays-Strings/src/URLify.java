import java.util.*;

/**
 * Replace all spaces in a String with ‘%20’.
 * 
 */
public class URLify {

    /**
     * Approach 1: In-place replacement using two pointers
     * 
     * Time Complexity: O(n) bc we must check each element for spaces
     * 
     * Space Complexity: O(1) bc fixed size arrays
     * 
     * Logic: Count how many spaces are in arr so we know eactly how much buffer space is needed to urlify.
     *        Create two pointers to read the true arr (readIndex) and write in the buffer for the urlified arr (writeIndex).
     *        If readIndex finds a space, writeIndex writes '%20' to the buffer.
     *        If readIndex finds a non-space char, writeIndex writes the char in the buffer.
     *        Do this backwards because the buffer is at the end of the true arr.
     * 
     * Solved 12/23/2024
     */
    public static char[] urlify1(char[] arr, int trueLength) {
        // First, count the number of spaces we need to urlify in arr
        int numSpaces = 0;
        for (int i = 0; i < trueLength; i++) {
            if (arr[i] == ' ')
                numSpaces++;
        }

        // Second pointer for the length of the urlified arr.
        // Can't set it to arr.length because there may be extra space we don't need
        int writeIndex = trueLength - 1 + numSpaces * 2;

        // Replace spaces backwards to add to the buffer at the end of the arr.
        // readIndex iterates through the true string and finds spaces.
        for (int readIndex = trueLength - 1; readIndex >= 0; readIndex--) {
            // Found a non-trailing space, add '%20' to the buffer backwards
            if (arr[readIndex] == ' ') {
                arr[writeIndex] = '0';
                arr[writeIndex - 1] = '2';
                arr[writeIndex - 2] = '%';
                writeIndex -= 3; // Move writeIndex over the '%20' we wrote
            } else { // Not a space, add the non-space char to the buffer
                arr[writeIndex] = arr[readIndex];
                writeIndex--; // Move writeIndex over the non-space char we wrote
            }
        }

        // Return the urlified arr
        return arr;
    }

    /**
     * Approach 2: StringBuilder
     * 
     * Time Complexity: O(n) bc we must check each element for spaces
     * 
     * Space Complexity: O(n) bc StringBuilder contains n elements
     * 
     * Logic: Append "%20" in StringBuilder for each space in the string or copy the
     * element.
     * Replace the string with the elements not visited yet.
     * 
     * Solved 12/20/2024
     */
    public static String urlify2(String string) {
        // Base Case 1: Null string cannot be urlified
        if (string == null) {
            return null;
        }

        // New string to return (urlified string)
        StringBuilder str = new StringBuilder();

        // Save true length of string
        int length = string.length();

        for (int i = 0; i < length; i++) {
            // If space is found, replace the string with the rest and append "%20" to str
            if (string.charAt(i) == ' ') {
                string = string.substring(i + 1, length); // inclusive bounds
                // Restart for loop for the replaced string
                length -= (i + 1);
                i = -1;
                // urlify the space
                str.append("%20");
            } else {
                str.append(string.charAt(i)); // Not a space, append to str
            }
        }

        return str.toString();
    }

}
