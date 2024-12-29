import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringRotationTest {

    @Test
    public void testStringRotation_BasicRotation() {
        assertTrue(StringRotation.stringRotation1("waterbottle", "erbottlewat"), "Basic rotation failed");
    }

    @Test
    public void testStringRotation_NoRotation() {
        assertFalse(StringRotation.stringRotation1("waterbottle", "bottlewaterx"), "Non-rotation string passed");
    }

    @Test
    public void testStringRotation_DifferentLengths() {
        assertFalse(StringRotation.stringRotation1("waterbottle", "erbottle"), "Strings of different lengths passed");
    }

    @Test
    public void testStringRotation_EmptyStrings() {
        assertTrue(StringRotation.stringRotation1("", ""), "Empty strings failed");
    }

    @Test
    public void testStringRotation_NullStrings() {
        assertFalse(StringRotation.stringRotation1(null, null), "Null strings passed");
        assertFalse(StringRotation.stringRotation1(null, "waterbottle"), "Null first string passed");
        assertFalse(StringRotation.stringRotation1("waterbottle", null), "Null second string passed");
    }

    @Test
    public void testStringRotation_SameString() {
        assertTrue(StringRotation.stringRotation1("abc", "abc"), "Same string failed as rotation");
    }
}
