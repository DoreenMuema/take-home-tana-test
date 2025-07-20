package main;

public class Question7_RotateList {
    public static class ListNode {
        String val;
        ListNode next;
        ListNode(String val) { this.val = val; }
    }

    /**
     * Rotates a linked list by moving each element n positions to the right.
     *
     * @param head Head of the linked list
     * @param n Number of positions to rotate
     * @return New head of the rotated list
     */
    public static ListNode rotateList(ListNode head, int n) {
        if (head == null || n == 0) return head;

        // Find the tail and length of the list
        ListNode tail = head;
        int length = 1;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        // Adjust n if it's larger than the length
        n = n % length;
        if (n == 0) return head; // No rotation needed

        // Find the new tail (length - n - 1 steps from head)
        ListNode newTail = head;
        for (int i = 0; i < length - n - 1; i++) {
            newTail = newTail.next;
        }

        // The node after newTail is the new head
        ListNode newHead = newTail.next;

        // Break the list and make it circular
        newTail.next = null;
        tail.next = head;

        return newHead;
    }

    // Helper method to create a list from an array (for testing)
    public static ListNode createList(String[] values) {
        if (values == null || values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    // Helper method to convert list to string (for testing)
    public static String listToString(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val);
            if (head.next != null) sb.append("->");
            head = head.next;
        }
        sb.append("->null");
        return sb.toString();
    }
}