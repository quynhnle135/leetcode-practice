package com.quynh.slidingwindow;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
//        Queue<Integer> myQ = new LinkedList<>();
//        for (int i = 1; i <= 10; i++) {
//            myQ.add(i);
//        }
//        System.out.println(myQ);
//        int value = myQ.remove();
//        System.out.println(value);
//        System.out.println(myQ);
//        myQ.remove();
//        System.out.println(myQ);
//
//        Set<Integer> mySet = new HashSet<>();
//        for (int i = 1; i <= 10; i++) {
//            mySet.add(i);
//        }
//        System.out.println(mySet);
//        mySet.remove(1);
//        System.out.println(mySet);
        Deque<Integer> myQueue = new ArrayDeque<>();
        myQueue.add(1);
        myQueue.add(3);
        myQueue.add(6);
        myQueue.add(5);
        myQueue.add(4);
        myQueue.add(2);
        myQueue.add(7);
        System.out.println(myQueue);
        int lastVal = myQueue.peekLast();
        System.out.println(lastVal);
        int firstVal = myQueue.peekFirst();
        System.out.println(firstVal);
        myQueue.remove();
        System.out.println("After removing: " + myQueue);
        System.out.println("Peek: " + myQueue.peek());
    }
}
