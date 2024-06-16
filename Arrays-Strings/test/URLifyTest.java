import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class URLifyTest {
    
    @Test
    public void testURLify_NoSpaces() {
        String input = "HelloWorld";
        String expected = "HelloWorld";
        assertEquals(expected, URLify.urlify1(input));
    }

    @Test
    public void testURLify_SingleSpace() {
        String input = "Hello World";
        String expected = "Hello%20World";
        assertEquals(expected, URLify.urlify1(input));
    }

    @Test
    public void testURLify_MultipleSpaces() {
        String input = "Mr John Smith";
        String expected = "Mr%20John%20Smith";
        assertEquals(expected, URLify.urlify1(input));
    }

    @Test
    public void testURLify_LeadingAndTrailingSpaces() {
        String input = "  Hello World    ";
        String expected = "%20%20Hello%20World%20%20%20%20";
        assertEquals(expected, URLify.urlify1(input));
    }

    @Test
    public void testURLify_AllSpaces() {
        String input = "   ";
        String expected = "%20%20%20";
        assertEquals(expected, URLify.urlify1(input));
    }

    @Test
    public void testURLify_EmptyString() {
        String input = "";
        String expected = "";
        assertEquals(expected, URLify.urlify1(input));
    }
}
