package com.quynh.linkedlist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {
    public static class ListNode {
        public int val;
        public ListNode next;

        // constructor
        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
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

    // fast and slow pointer
    public static boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = reverse(slow);
        fast = head;
        while (slow != null) {
            if (fast.val != slow.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
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

    public static boolean checkPalindrome(ListNode head) {
        ListNode current = head;
        List<Integer> arr = new ArrayList<>();
        while (current != null) {
            arr.add(current.val);
            current = current.next;
        }
        int p1 = 0;
        int p2 = arr.size() - 1;
        while (p1 < p2) {
            if (!arr.get(p1).equals(arr.get(p2))) {
                return false;
            }
            p1++;
            p2--;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
//        System.out.println(isPalindrome(head));
        System.out.println(checkPalindrome(head));
    }


}
