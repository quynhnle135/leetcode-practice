package com.quynh.linkedlist;

public class RemoveLinkedElements {
    public static class ListNode {
        int val;
        ListNode next;
        public ListNode() {}
        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode cur = dummyHead;

        while (cur.next != null) {
           if (cur.next.val == val) {
               cur.next = cur.next.next;
           } else {
               cur = cur.next;
           }

        }
        return dummyHead.next;
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
        ListNode head = new ListNode(7);
        head.next = new ListNode(7);
        head.next.next = new ListNode(7);
        head.next.next.next = new ListNode(7);
        head.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next = new ListNode(7);

        traverse(removeElements(head, 7));
    }
}
