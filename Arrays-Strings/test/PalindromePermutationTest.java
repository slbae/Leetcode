import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PalindromePermutationTest {
    
    @Test
    public void testEmptyString() {
        assertTrue(PalindromePermutation.palindromePermutation1(""));
        assertTrue(PalindromePermutation.palindromePermutation2(""));
    }

    @Test
    public void testSingleCharacter() {
        assertTrue(PalindromePermutation.palindromePermutation1("a"));
        assertTrue(PalindromePermutation.palindromePermutation2("a"));
    }

    @Test
    public void testTwoIdenticalCharacters() {
        assertTrue(PalindromePermutation.palindromePermutation1("aa"));
        assertTrue(PalindromePermutation.palindromePermutation2("aa"));
    }

    @Test
    public void testPalindromePermutationEvenLength() {
        assertTrue(PalindromePermutation.palindromePermutation1("aabb"));
        assertTrue(PalindromePermutation.palindromePermutation2("aabb"));
    }

    @Test
    public void testPalindromePermutationOddLength() {
        assertTrue(PalindromePermutation.palindromePermutation1("aab"));
        assertTrue(PalindromePermutation.palindromePermutation2("aab"));
    }

    @Test
    public void testNotAPalindromePermutation() {
        assertFalse(PalindromePermutation.palindromePermutation1("abc"));
        assertFalse(PalindromePermutation.palindromePermutation2("abc"));
    }

    @Test
    public void testIgnoreCasing() {
        assertTrue(PalindromePermutation.palindromePermutation1("AaBb"));
        assertTrue(PalindromePermutation.palindromePermutation2("AaBb"));
    }

    @Test
    public void testIgnoreNonLetterCharacters() {
        assertTrue(PalindromePermutation.palindromePermutation1("Tact Coa")); // "taco cat"
        assertTrue(PalindromePermutation.palindromePermutation2("Tact Coa"));
    }

    @Test
    public void testComplexCase() {
        assertTrue(PalindromePermutation.palindromePermutation1("A man, a plan, a canal, Panama!"));
        assertTrue(PalindromePermutation.palindromePermutation2("A man, a plan, a canal, Panama!"));
    }

    @Test
    public void testNoValidPermutation() {
        assertFalse(PalindromePermutation.palindromePermutation1("random string"));
        assertFalse(PalindromePermutation.palindromePermutation2("random string"));
    }

    @Test
    public void testDifferentCharacters() {
        assertFalse(PalindromePermutation.palindromePermutation1("abcdefg"));
        assertFalse(PalindromePermutation.palindromePermutation2("abcdefg"));
    }

    @Test
    public void testMixedCharacters() {
        assertTrue(PalindromePermutation.palindromePermutation1("aabbccddeeffgg"));
        assertTrue(PalindromePermutation.palindromePermutation2("aabbccddeeffgg"));
    }

    @Test
    public void testNonPalindromeWithSpaces() {
        assertFalse(PalindromePermutation.palindromePermutation1("This is not a palindrome"));
        assertFalse(PalindromePermutation.palindromePermutation2("This is not a palindrome"));
    }

    @Test
    public void testNonPalindromeWithPunctuation() {
        assertFalse(PalindromePermutation.palindromePermutation1("Random, string!"));
        assertFalse(PalindromePermutation.palindromePermutation2("Random, string!"));
    }

    @Test
    public void testRepeatedNonPalindrome() {
        assertTrue(PalindromePermutation.palindromePermutation1("abcabcabcabc"));
        assertTrue(PalindromePermutation.palindromePermutation2("abcabcabcabc"));
    }
}
