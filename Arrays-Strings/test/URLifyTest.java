import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class URLifyTest {
    
    @Test
    public void testUrlifyWithTrailingSpaces() {
        char[] input = new char[] {'M', 'r', ' ', 'J', 'o', 'h', 'n', ' ', 'S', 'm', 'i', 't', 'h', ' ', ' ', ' ', ' '};
        int trueLength = 13; // "Mr John Smith" has 13 characters

        char[] expected = new char[] {'M', 'r', '%', '2', '0', 'J', 'o', 'h', 'n', '%', '2', '0', 'S', 'm', 'i', 't', 'h'};
        char[] result = URLify.urlify1(input, trueLength);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testUrlifyWithoutSpaces() {
        char[] input = new char[] {'H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd'};
        int trueLength = 10; // "HelloWorld" has 10 characters

        char[] expected = new char[] {'H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd'};
        char[] result = URLify.urlify1(input, trueLength);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testUrlifyEmptyArray() {
        char[] input = new char[] {};
        int trueLength = 0; // Empty string

        char[] expected = new char[] {};
        char[] result = URLify.urlify1(input, trueLength);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testUrlifyNoTrailingSpaces() {
        char[] input = new char[] {'N', 'o', 'S', 'p', 'a', 'c', 'e', 's', 'H', 'e', 'r', 'e'};
        int trueLength = 12; // "NoSpacesHere" has 12 characters

        char[] expected = new char[] {'N', 'o', 'S', 'p', 'a', 'c', 'e', 's', 'H', 'e', 'r', 'e'};
        char[] result = URLify.urlify1(input, trueLength);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testUrlifyEdgeCase() {
        char[] input = new char[] {' ', 'a', ' ', ' '};
        int trueLength = 2; // " a "

        char[] expected = new char[] {'%', '2', '0', 'a'};
        char[] result = URLify.urlify1(input, trueLength);

        assertArrayEquals(expected, result);
    }
    }
    