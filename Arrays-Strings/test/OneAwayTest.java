import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class OneAwayTest {
    
    @Test
    public void testNoEdits() {
        assertTrue(OneAway.oneAway1("pale", "pale"));
        assertTrue(OneAway.oneAway2("pale", "pale"));

    }

    @Test
    public void testOneEditReplace() {
        assertTrue(OneAway.oneAway1("pale", "bale"));
        assertTrue(OneAway.oneAway2("pale", "bale"));

    }

    @Test
    public void testOneEditInsert() {
        assertTrue(OneAway.oneAway1("pale", "pales"));
        assertTrue(OneAway.oneAway2("pale", "pales"));

    }

    @Test
    public void testOneEditRemove() {
        assertTrue(OneAway.oneAway1("pales", "pale"));
        assertTrue(OneAway.oneAway2("pales", "pale"));

    }

    @Test
    public void testTwoEdits() {
        assertFalse(OneAway.oneAway1("pale", "bake"));
        assertFalse(OneAway.oneAway2("pale", "bake"));

    }

    @Test
    public void testDifferentLengths() {
        assertFalse(OneAway.oneAway1("pale", "palesss"));
        assertFalse(OneAway.oneAway2("pale", "palesss"));

    }

    @Test
    public void testEmptyStrings() {
        assertTrue(OneAway.oneAway1("", ""));
        assertTrue(OneAway.oneAway2("", ""));

    }

    @Test
    public void testOneEmptyString() {
        assertTrue(OneAway.oneAway1("", "a"));
        assertTrue(OneAway.oneAway2("", "a"));

    }

    @Test
    public void testSameLengthDifferentChars() {
        assertFalse(OneAway.oneAway1("abcd", "efgh"));
        assertFalse(OneAway.oneAway2("abcd", "efgh"));

    }

    @Test
    public void testInsertAtBeginning() {
        assertTrue(OneAway.oneAway1("ale", "pale"));
        assertTrue(OneAway.oneAway2("ale", "pale"));

    }

    @Test
    public void testInsertAtEnd() {
        assertTrue(OneAway.oneAway1("pal", "pale"));
        assertTrue(OneAway.oneAway2("pal", "pale"));

    }

    @Test
    public void testRemoveAtBeginning() {
        assertTrue(OneAway.oneAway1("pale", "ale"));
        assertTrue(OneAway.oneAway2("pale", "ale"));

    }

    @Test
    public void testRemoveAtEnd() {
        assertTrue(OneAway.oneAway1("pale", "pal"));
        assertTrue(OneAway.oneAway2("pale", "pal"));

    }
}
