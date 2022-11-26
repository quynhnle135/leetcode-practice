package com.quynh.linkedlist;

public class DeleteMidNode {
    public static class ListNode {
        int val;
        ListNode next;
        // constructor
        public ListNode() {

        }

        public ListNode(int val) {
            this.val = val;

        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public static ListNode deleteMiddleNode(ListNode head) {
            if (head.next == null) return null;
            int numberOfNodes = 0;
            ListNode cur = head;
            // count number of nodes in the list
            while (cur != null) {
                numberOfNodes++;
                cur = cur.next;
            }

            int midPos = numberOfNodes / 2;
            ListNode dummyHead = new ListNode();
            dummyHead.next = head;

            ListNode mid = head;
            int start = 0;
            // traverse to the middle node of the list
            while (start < (midPos - 1)) {
                mid = mid.next;
                start++;
            }
            mid.next = mid.next.next;
            return head;
        }

        public static void traverse(ListNode head) {
            ListNode cur = head;
            while (cur.next != null) {
                System.out.print(cur.val + " -> ");
                cur = cur.next;
            }
            System.out.print(cur.val + " -> null");
        }

        public static void main(String[] args) {
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);
            head.next.next.next.next.next = new ListNode(6);
            traverse(deleteMiddleNode(head));
        }
    }
}
