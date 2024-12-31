import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RemoveDupsTest {

    @Test
    void testRemoveDups_withDuplicates() {
        // Arrange
        RemoveDups.Node head1 = new RemoveDups().new Node(1);
        head1.appendToTail(2);
        head1.appendToTail(3);
        head1.appendToTail(2);
        head1.appendToTail(4);
        head1.appendToTail(3);

        RemoveDups.Node head2 = cloneList(head1);

        // Act
        RemoveDups.Node result1 = RemoveDups.removeDups1(head1);
        RemoveDups.Node result2 = RemoveDups.removeDups2(head2);

        // Assert
        assertNotNull(result1);
        assertNotNull(result2);

        assertEquals(1, head1.data);
        assertEquals(2, head1.next.data);
        assertEquals(3, head1.next.next.data);
        assertEquals(4, head1.next.next.next.data);
        assertNull(head1.next.next.next.next);

        assertEquals(1, head2.data);
        assertEquals(2, head2.next.data);
        assertEquals(3, head2.next.next.data);
        assertEquals(4, head2.next.next.next.data);
        assertNull(head2.next.next.next.next);
    }

    @Test
    void testRemoveDups_withAllDuplicates() {
        // Arrange
        RemoveDups.Node head1 = new RemoveDups().new Node(1);
        head1.appendToTail(1);
        head1.appendToTail(1);
        head1.appendToTail(1);

        RemoveDups.Node head2 = cloneList(head1);

        // Act
        RemoveDups.Node result1 = RemoveDups.removeDups1(head1);
        RemoveDups.Node result2 = RemoveDups.removeDups2(head2);

        // Assert
        assertNotNull(result1);
        assertNotNull(result2);

        assertEquals(1, head1.data);
        assertNull(head1.next);

        assertEquals(1, head2.data);
        assertNull(head2.next);
    }

    @Test
    void testRemoveDups_withNonConsecutiveDuplicates() {
        // Arrange
        RemoveDups.Node head1 = new RemoveDups().new Node(1);
        head1.appendToTail(2);
        head1.appendToTail(3);
        head1.appendToTail(2);
        head1.appendToTail(4);
        head1.appendToTail(1);

        RemoveDups.Node head2 = cloneList(head1);

        // Act
        RemoveDups.Node result1 = RemoveDups.removeDups1(head1);
        RemoveDups.Node result2 = RemoveDups.removeDups2(head2);

        // Assert
        assertNotNull(result1);
        assertNotNull(result2);

        assertEquals(1, head1.data);
        assertEquals(2, head1.next.data);
        assertEquals(3, head1.next.next.data);
        assertEquals(4, head1.next.next.next.data);
        assertNull(head1.next.next.next.next);

        assertEquals(1, head2.data);
        assertEquals(2, head2.next.data);
        assertEquals(3, head2.next.next.data);
        assertEquals(4, head2.next.next.next.data);
        assertNull(head2.next.next.next.next);
    }

    @Test
    void testRemoveDups_withDuplicatesAtEnd() {
        // Arrange
        RemoveDups.Node head1 = new RemoveDups().new Node(1);
        head1.appendToTail(2);
        head1.appendToTail(3);
        head1.appendToTail(4);
        head1.appendToTail(4);
        head1.appendToTail(4);

        RemoveDups.Node head2 = cloneList(head1);

        // Act
        RemoveDups.Node result1 = RemoveDups.removeDups1(head1);
        RemoveDups.Node result2 = RemoveDups.removeDups2(head2);

        // Assert
        assertNotNull(result1);
        assertNotNull(result2);

        assertEquals(1, head1.data);
        assertEquals(2, head1.next.data);
        assertEquals(3, head1.next.next.data);
        assertEquals(4, head1.next.next.next.data);
        assertNull(head1.next.next.next.next);

        assertEquals(1, head2.data);
        assertEquals(2, head2.next.data);
        assertEquals(3, head2.next.next.data);
        assertEquals(4, head2.next.next.next.data);
        assertNull(head2.next.next.next.next);
    }

    @Test
    void testRemoveDups_noDuplicates() {
        // Arrange
        RemoveDups.Node head1 = new RemoveDups().new Node(1);
        head1.appendToTail(2);
        head1.appendToTail(3);
        head1.appendToTail(4);

        RemoveDups.Node head2 = cloneList(head1);

        // Act
        RemoveDups.Node result1 = RemoveDups.removeDups1(head1);
        RemoveDups.Node result2 = RemoveDups.removeDups2(head2);

        // Assert
        assertNotNull(result1);
        assertNotNull(result2);

        assertEquals(1, head1.data);
        assertEquals(2, head1.next.data);
        assertEquals(3, head1.next.next.data);
        assertEquals(4, head1.next.next.next.data);
        assertNull(head1.next.next.next.next);

        assertEquals(1, head2.data);
        assertEquals(2, head2.next.data);
        assertEquals(3, head2.next.next.data);
        assertEquals(4, head2.next.next.next.data);
        assertNull(head2.next.next.next.next);
    }

    @Test
    void testRemoveDups_emptyList() {
        // Arrange
        RemoveDups.Node head1 = null;
        RemoveDups.Node head2 = null;

        // Act
        RemoveDups.Node result1 = RemoveDups.removeDups1(head1);
        RemoveDups.Node result2 = RemoveDups.removeDups2(head2);

        // Assert
        assertNull(result1);
        assertNull(result2);
    }

    @Test
    void testRemoveDups_singleElementList() {
        // Arrange
        RemoveDups.Node head1 = new RemoveDups().new Node(1);
        RemoveDups.Node head2 = cloneList(head1);

        // Act
        RemoveDups.Node result1 = RemoveDups.removeDups1(head1);
        RemoveDups.Node result2 = RemoveDups.removeDups2(head2);

        // Assert
        assertNotNull(result1);
        assertNotNull(result2);

        assertEquals(1, result1.data);
        assertNull(result1.next);

        assertEquals(1, result2.data);
        assertNull(result2.next);
    }

    // Helper method to clone a linked list
    private RemoveDups.Node cloneList(RemoveDups.Node head) {
        if (head == null) {
            return null;
        }

        RemoveDups.Node newHead = new RemoveDups().new Node(head.data);
        RemoveDups.Node current = head.next;
        RemoveDups.Node newCurrent = newHead;

        while (current != null) {
            newCurrent.next = new RemoveDups().new Node(current.data);
            newCurrent = newCurrent.next;
            current = current.next;
        }

        return newHead;
    }
}
