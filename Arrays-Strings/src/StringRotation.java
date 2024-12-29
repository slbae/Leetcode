import java.util.*;

/**
 * Assume you are given a method isSubstring which checks if one word is a substring of another.
 * Given two strings (s1 and s2), check if s2 is a rotation of s1 using only one call to isSubstring.
 */
public class StringRotation {

    /**
     * Checks if s2 is a substring of s1.
     * 
     * @param s1 the string to search within
     * @param s2 the string to search for
     * @return true if s2 is a substring of s1, false otherwise
     */
    public static boolean isSubstring(String s1, String s2) {
        // Base cases: null or empty strings
        if (s1 == null || s2 == null) {
            return false;
        }

        // Return true if s2 is a substring of s1
        return s1.contains(s2);
    }

    /**
     * Approach: 
     * 
     * Time Complexity: O()
     * 
     * Space Complexity: O()
     * 
     * Logic:
     * 
     * Date: 12/29/2024
     */
    public static boolean stringRotation1(String s1, String s2) {
        // Base Case: Null strings or unequal lengths
        if (s1 == null || s2 == null) return false;
        if (s1.length() != s2.length()) return false;

        // Check if s1 and s2 are rotated from each other
        String concantenated = s1 + s1;

        return isSubstring(concantenated, s1);    
    }
}
