import java.util.*;

// Remove duplicates from an unsorted linked list
public class RemoveDups {

    /**
     * Approach 1: With Buffer (HashSet)
     * 
     * Time Complexity: O(n) bc searching entire list
     * 
     * Space Complexity; O(n) bc hashset can contain n elements
     * 
     * Logic: 
     * 
     * Date: 12/30/2024
     */
    public static Node removeDups1(Node n) {
        // Base Case: size < 2
        if (n == null) {
            return n;
        }
        
        // Space Complexity: O(n)
        HashSet<Integer> set = new HashSet<>();

        Node curr = n;
        // Add data to set
        set.add(curr.data);

        while (curr.next != null) {
            // Check if duplicate
            if (set.contains(curr.next.data)) {
                // Remove duplicate
                curr.next = curr.next.next;
            }
            else {
                // Not a duplicate, add to set
                set.add(curr.next.data);
                // Move on to next node
                curr = curr.next;
            }
        }
        // Return the head of the original list
        return n;
    }

    /**
     * Approach 2: Without Buffer (Runner Technique)
     * 
     * Time Complexity: O(n^2) bc searching entire list for each element
     * 
     * Space Complexity; O(1) no additional space
     * 
     * Logic: Use a runner pointer to make a pass to find duplicates for each node and remove them.
     * 
     * Date: 12/30/2024
     */
    public static Node removeDups2(Node n) {    
        Node curr = n;

        while (curr != null) {
            // Find duplcates for curr
            Node runner = curr;
            // Runner searches through list for a duplicate of curr
            while (runner.next != null) {
                if (curr.data == runner.next.data) {
                    // Remove duplicate
                    runner.next = runner.next.next;
                }
                else {
                    // Not a duplicate, keep searching through list
                    runner = runner.next;
                }
            }
            // No more curr duplicates
            curr = curr.next;
        }
        return n;
    }

    // Node implementation given
    class Node {
        Node next = null;
        int data;

        public Node(int d) {
            data = d;
        }

        void appendToTail(int d) {
            Node end = new Node(d);
            Node n = this;
            while (n.next != null) {
                n = n.next;
            }
            n.next = end;
        }
    }
}