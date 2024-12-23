import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringCompressionTest {

    @Test
    public void testStringCompression1_singleCharacters() {
        // Input with all single characters
        String input = "abcdef";
        String expected = "abcdef";
        assertEquals(expected, StringCompression.stringCompression1(input));
    }

    @Test
    public void testStringCompression1_repeatingCharacters() {
        // Input with repeating characters
        String input = "aabbccc";
        String expected = "a2b2c3";
        assertEquals(expected, StringCompression.stringCompression1(input));
    }

    @Test
    public void testStringCompression1_mixedRepeatingAndSingle() {
        // Input with a mix of repeating and single characters
        String input = "aabcccccaaa";
        String expected = "a2b1c5a3";
        assertEquals(expected, StringCompression.stringCompression1(input));
    }

    @Test
    public void testStringCompression1_oneCharacterString() {
        // Input with a single character
        String input = "a";
        String expected = "a";
        assertEquals(expected, StringCompression.stringCompression1(input));
    }

    @Test
    public void testStringCompression1_allRepeatingCharacters() {
        // Input with all repeating characters
        String input = "bbbbbbbb";
        String expected = "b8";
        assertEquals(expected, StringCompression.stringCompression1(input));
    }

    @Test
    public void testStringCompression1_emptyString() {
        // Input with an empty string
        String input = "";
        String expected = "";
        assertEquals(expected, StringCompression.stringCompression1(input));
    }

    @Test
    public void testStringCompression1_caseSensitive() {
        // Case sensitivity test
        String input = "aaAA";
        String expected = "aaAA";
        assertEquals(expected, StringCompression.stringCompression1(input));
    }

    @Test
    public void testStringCompression2_caseSensitive() {
        // Case sensitivity test
        String input = "aabccCCCaaAAA";
        String expected = "a2b1c2C3a2A3";
        assertEquals(expected, StringCompression.stringCompression1(input));
    }
}

