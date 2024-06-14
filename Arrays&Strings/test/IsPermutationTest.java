import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IsPermutationTest {

    @Test
    public void testPermutation() {
        assertTrue(IsPermutation.isPermutation1("abc", "bca"), "The strings 'abc' and 'bca' should be permutations of each other.");
        assertTrue(IsPermutation.isPermutation2("abc", "bca"), "The strings 'abc' and 'bca' should be permutations of each other.");
    }

    @Test
    public void testNotPermutation() {
        assertFalse(IsPermutation.isPermutation1("abc", "def"), "The strings 'abc' and 'def' should not be permutations of each other.");
        assertFalse(IsPermutation.isPermutation2("abc", "def"), "The strings 'abc' and 'def' should not be permutations of each other.");
    }

    @Test
    public void testDifferentLengths() {
        assertFalse(IsPermutation.isPermutation1("abcd", "abc"), "Strings of different lengths cannot be permutations of each other.");
        assertFalse(IsPermutation.isPermutation2("abcd", "abc"), "Strings of different lengths cannot be permutations of each other.");
    }

    @Test
    public void testEmptyStrings() {
        assertTrue(IsPermutation.isPermutation1("", ""), "Two empty strings should be permutations of each other.");
        assertTrue(IsPermutation.isPermutation2("", ""), "Two empty strings should be permutations of each other.");
    }

    @Test
    public void testOneEmptyString() {
        assertFalse(IsPermutation.isPermutation1("abc", ""), "A non-empty string and an empty string cannot be permutations of each other.");
        assertFalse(IsPermutation.isPermutation2("abc", ""), "A non-empty string and an empty string cannot be permutations of each other.");
    }

    @Test
    public void testNullStrings() {
        assertFalse(IsPermutation.isPermutation1(null, "abc"), "A null string and a non-null string cannot be permutations of each other.");
        assertFalse(IsPermutation.isPermutation1("abc", null), "A null string and a non-null string cannot be permutations of each other.");
        assertFalse(IsPermutation.isPermutation1(null, null), "Two null strings should not be considered permutations of each other.");
    
        assertFalse(IsPermutation.isPermutation2(null, "abc"), "A null string and a non-null string cannot be permutations of each other.");
        assertFalse(IsPermutation.isPermutation2("abc", null), "A null string and a non-null string cannot be permutations of each other.");
        assertFalse(IsPermutation.isPermutation2(null, null), "Two null strings should not be considered permutations of each other.");
    }

    @Test
    public void testSpecialCharacters() {
        assertTrue(IsPermutation.isPermutation1("a!b@c", "c@b!a"), "The strings 'a!b@c' and 'c@b!a' should be permutations of each other.");
        assertTrue(IsPermutation.isPermutation2("a!b@c", "c@b!a"), "The strings 'a!b@c' and 'c@b!a' should be permutations of each other.");
    }

    @Test
    public void testIdenticalStrings() {
        assertTrue(IsPermutation.isPermutation1("abcd", "abcd"), "Identical strings should be permutations of each other.");
        assertTrue(IsPermutation.isPermutation2("abcd", "abcd"), "Identical strings should be permutations of each other.");
    }

    @Test
    public void testCaseSensitivity() {
        assertFalse(IsPermutation.isPermutation1("abc", "ABC"), "The strings 'abc' and 'ABC' should not be permutations of each other (case-sensitive).");
        assertFalse(IsPermutation.isPermutation2("abc", "ABC"), "The strings 'abc' and 'ABC' should not be permutations of each other (case-sensitive).");
    }

}
    
