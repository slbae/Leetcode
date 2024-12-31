import java.util.*;

// Return the kth to last element of a singly linked list
public class ReturnKthToLast {

    /**
     * Approach 1: 
     * 
     * Time Complexity: O()
     * 
     * Space Complexity; O()
     * 
     * Logic: 
     * 
     * Date: 12/31/2024
     */
    public static int returnKthToLast1(Node n) {

    }

    /**
     * Approach 2: 
     * 
     * Time Complexity: O()
     * 
     * Space Complexity; O()
     * 
     * Logic:
     * 
     * Date: 12/31/2024
     */
    public static int returnKthToLast2(Node n) {

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
