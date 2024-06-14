import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Test program for IsUnique.
 * @author Sylbi Bae
 * 
 * Updated 6/13/2024
 */
public class IsUniqueTest {

    @Test
    public void testUniqueString() {
        assertTrue(IsUnique.isUnique1("abcdef"), "The string 'abcdef' should be unique.");
        assertTrue(IsUnique.isUnique2("abcdef"), "The string 'abcdef' should be unique.");
    }

    @Test
    public void testNonUniqueString() {
        assertFalse(IsUnique.isUnique1("aabbcc"), "The string 'aabbcc' should not be unique.");
        assertFalse(IsUnique.isUnique2("aabbcc"), "The string 'aabbcc' should not be unique.");
    }

    @Test
    public void testEmptyString() {
        assertTrue(IsUnique.isUnique1(""), "An empty string should be considered unique.");
        assertTrue(IsUnique.isUnique2(""), "An empty string should be considered unique.");
    }

    @Test
    public void testSingleCharacterString() {
        assertTrue(IsUnique.isUnique1("a"), "A single character string should be unique.");
        assertTrue(IsUnique.isUnique2("a"), "A single character string should be unique.");
    }

    @Test
    public void testStringWithSpaces() {
        assertFalse(IsUnique.isUnique1("a b c"), "The string 'a b c' should not be unique with multiple spaces.");
        assertFalse(IsUnique.isUnique2("a b c"), "The string 'a b c' should not be unique with multiple spaces.");
    }

    @Test
    public void testStringWithSpecialCharacters() {
        assertTrue(IsUnique.isUnique1("!@#$%^&*()"), "The string '!@#$%^&*()' should be unique.");
        assertTrue(IsUnique.isUnique2("!@#$%^&*()"), "The string '!@#$%^&*()' should be unique.");
    }

    @Test
    public void testLongUniqueString() {
        assertTrue(IsUnique.isUnique1("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+[]{}|;:'\",.<>?/~`"), 
                   "A long string with all unique characters should be unique.");
        assertTrue(IsUnique.isUnique2("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+[]{}|;:'\",.<>?/~`"), 
                   "A long string with all unique characters should be unique.");
    }

    @Test
    public void testLongNonUniqueString() {
        String nonUnique = "a".repeat(129);
        assertFalse(IsUnique.isUnique1(nonUnique), "A string longer than 128 characters with repeated 'a' should not be unique.");
        assertFalse(IsUnique.isUnique2(nonUnique), "A string longer than 128 characters with repeated 'a' should not be unique.");
    }

    @Test
    public void testNullString() {
        assertTrue(IsUnique.isUnique1(null), "A null string should return false.");
        assertTrue(IsUnique.isUnique2(null), "A null string should return false.");
    }
}
