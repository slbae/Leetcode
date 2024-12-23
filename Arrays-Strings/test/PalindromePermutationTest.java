import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PalindromePermutationTest {
    
    @Test
    public void testEmptyString() {
        assertTrue(PalindromePermutation.palindromePermutation1(""));
        assertTrue(PalindromePermutation.palindromePermutation2(""));
        assertTrue(PalindromePermutation.palindromePermutation3(""));
    }

    @Test
    public void testSingleCharacter() {
        assertTrue(PalindromePermutation.palindromePermutation1("a"));
        assertTrue(PalindromePermutation.palindromePermutation2("a"));
        assertTrue(PalindromePermutation.palindromePermutation3("a"));
    }

    @Test
    public void testTwoIdenticalCharacters() {
        assertTrue(PalindromePermutation.palindromePermutation1("aa"));
        assertTrue(PalindromePermutation.palindromePermutation2("aa"));
        assertTrue(PalindromePermutation.palindromePermutation3("aa"));
    }

    @Test
    public void testPalindromePermutationEvenLength() {
        assertTrue(PalindromePermutation.palindromePermutation1("aabb"));
        assertTrue(PalindromePermutation.palindromePermutation2("aabb"));
        assertTrue(PalindromePermutation.palindromePermutation3("aabb"));
    }

    @Test
    public void testPalindromePermutationOddLength() {
        assertTrue(PalindromePermutation.palindromePermutation1("aab"));
        assertTrue(PalindromePermutation.palindromePermutation2("aab"));
        assertTrue(PalindromePermutation.palindromePermutation3("aab"));
    }

    @Test
    public void testNotAPalindromePermutation() {
        assertFalse(PalindromePermutation.palindromePermutation1("abc"));
        assertFalse(PalindromePermutation.palindromePermutation2("abc"));
        assertFalse(PalindromePermutation.palindromePermutation3("abc"));
    }

    @Test
    public void testIgnoreCasing() {
        assertTrue(PalindromePermutation.palindromePermutation1("AaBb"));
        assertTrue(PalindromePermutation.palindromePermutation2("AaBb"));
        assertTrue(PalindromePermutation.palindromePermutation3("AaBb"));
    }

    @Test
    public void testIgnoreNonLetterCharacters() {
        assertTrue(PalindromePermutation.palindromePermutation1("Tact Coa")); // "taco cat"
        assertTrue(PalindromePermutation.palindromePermutation2("Tact Coa"));
        assertTrue(PalindromePermutation.palindromePermutation3("Tact Coa"));
    }

    @Test
    public void testComplexCase() {
        assertTrue(PalindromePermutation.palindromePermutation1("A man, a plan, a canal, Panama!"));
        assertTrue(PalindromePermutation.palindromePermutation2("A man, a plan, a canal, Panama!"));
        assertTrue(PalindromePermutation.palindromePermutation3("A man, a plan, a canal, Panama!"));
    }

    @Test
    public void testNoValidPermutation() {
        assertFalse(PalindromePermutation.palindromePermutation1("random string"));
        assertFalse(PalindromePermutation.palindromePermutation2("random string"));
        assertFalse(PalindromePermutation.palindromePermutation3("random string"));
    }

    @Test
    public void testDifferentCharacters() {
        assertFalse(PalindromePermutation.palindromePermutation1("abcdefg"));
        assertFalse(PalindromePermutation.palindromePermutation2("abcdefg"));
        assertFalse(PalindromePermutation.palindromePermutation3("abcdefg"));
    }

    @Test
    public void testMixedCharacters() {
        assertTrue(PalindromePermutation.palindromePermutation1("aabbccddeeffgg"));
        assertTrue(PalindromePermutation.palindromePermutation2("aabbccddeeffgg"));
        assertTrue(PalindromePermutation.palindromePermutation3("aabbccddeeffgg"));
    }

    @Test
    public void testNonPalindromeWithSpaces() {
        assertFalse(PalindromePermutation.palindromePermutation1("This is not a palindrome"));
        assertFalse(PalindromePermutation.palindromePermutation2("This is not a palindrome"));
        assertFalse(PalindromePermutation.palindromePermutation3("This is not a palindrome"));
    }

    @Test
    public void testNonPalindromeWithPunctuation() {
        assertFalse(PalindromePermutation.palindromePermutation1("Random, string!"));
        assertFalse(PalindromePermutation.palindromePermutation2("Random, string!"));
        assertFalse(PalindromePermutation.palindromePermutation3("Random, string!"));
    }

    @Test
    public void testRepeatedNonPalindrome() {
        assertTrue(PalindromePermutation.palindromePermutation1("abcabcabcabc"));
        assertTrue(PalindromePermutation.palindromePermutation2("abcabcabcabc"));
        assertTrue(PalindromePermutation.palindromePermutation3("abcabcabcabc"));
    }

    @Test
    public void testPalindromeWithNonLetters() {
        assertTrue(PalindromePermutation.palindromePermutation1("T/act$$ Co*a"));
        assertTrue(PalindromePermutation.palindromePermutation2("T/act$$ Co*a"));
        assertTrue(PalindromePermutation.palindromePermutation3("T/act$$ Co*a"));
    }
}
