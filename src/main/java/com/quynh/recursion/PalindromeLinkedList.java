package com.quynh.recursion;

import java.util.List;

public class PalindromeLinkedList {
    public static class ListNode {
        int value;
        ListNode next;
        // constructor
        public ListNode(int val) {
            this.value = val;
            this.next = null;
        }
    }
    public static boolean checkPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        int count = 0;

        // traverse to the mid node
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            count++;
        }
        if (count % 2 != 0) {
            slow = slow.next;
        }

        fast = head;
        slow = reverse(slow);

        while (slow != null) {
            if (slow.value != fast.value) {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }
    public static ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }
//    public static boolean checkPalindromeRecursion(ListNode head) {
//
//    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);
        System.out.println(checkPalindrome(head));
    }
}
