package com.quynh.linkedlist;

public class ReverseLinkedList {
    public static class ListNode {
        int val;
        ListNode next;
        // constructor
        public ListNode() {}
        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode nextNode = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextNode;
        }
        return prev;
    }

    public static void traverse(ListNode head) {
        while(head.next != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.print(head.val + " -> null");
    }

    public static ListNode reverseListRecursive(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode rest = head.next;
        ListNode reverse = reverseListRecursive(rest);
        rest.next = head;
        head.next = null;

        return reverse;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
//
//        traverse(reverse(head));
        traverse(reverseListRecursive(head));

    }
}
