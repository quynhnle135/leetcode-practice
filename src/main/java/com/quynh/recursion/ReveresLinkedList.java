
package com.quynh.recursion;

public class ReveresLinkedList {
    public static class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode reverseLinkedList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }

    public static ListNode reverse(ListNode head) {
        return reverseRecursively(head, null);
    }

    public static ListNode reverseRecursively(ListNode head, ListNode newHead) {
        if (head == null) {
            return newHead;
        }
        ListNode nextNode = head.next;
        head.next = newHead;
        newHead = head;
        head = nextNode;
        return reverseRecursively(head, newHead);
    }

    public static void traverse(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        traverse(reverse(head));
    }
}
