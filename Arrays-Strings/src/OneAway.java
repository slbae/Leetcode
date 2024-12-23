import java.util.*;

/**
 * Given 2 Strings, determine if they are <= 1 edit(s) away from each other.
 * An edit can be inserting, removing, or replacing one char.
 * Return true if they are one edit away from each other.
 */
public class OneAway {

    /**
     * Approach 1: Two pointers
     * 
     * Time Complexity: O(n) bc we have to iterate through each char in the strings
     * 
     * Space Complexity: O(n) bc hashmaps the length of the strings
     * 
     * Logic: Move two index pointers through the two strings and compare chars to find any differences.
     *        If there is more than one difference, return false. The insert and remove edit can be
     *        accounted for simultaeously by checking for the difference in length.
     * 
     * Solved 12/22/2024
     */
    public static boolean oneAway1(String string1, String string2) {
        // Edge Case: If the length difference is greater than 1, they can't be one edit away
        if (Math.abs(string1.length() - string2.length()) > 1) {
            return false;
        }

        // Identify shorter and longer string
        String shorter = string1.length() < string2.length() ? string1 : string2;
        String longer = string1.length() < string2.length() ? string2 : string1;

        int shorterIndex = 0, longerIndex = 0;
        boolean foundDifference = false; // could also be an int for numDifferences

        // Iterate through both strings and compare for edits
        while (shorterIndex < shorter.length() && longerIndex < longer.length()) {
            // Found a difference, only move longerIndex bc we still want to match the char
            // from the shorter string to the next char in the longer string.
            if (shorter.charAt(shorterIndex) != longer.charAt(longerIndex)) {
                // If already found one difference, return false
                if (foundDifference) {
                    return false;
                }
                else { // Only found one difference so far
                    foundDifference = true;
                }
                // If lengths are equal, move shorter pointer (replacement case)
                if (shorter.length() == longer.length()) {
                    shorterIndex++;
                }
            }
            else { // Same char at the same index for both strings, no difference. Move both strings.
                shorterIndex++; // Move pointer for the shorter string bc 
            }
            longerIndex++; // Always move pointer for the longer string bc we need to compare different pairs of chars every time 
        }

        // Found < 2 differences, return true.
        return true;
    }

}
