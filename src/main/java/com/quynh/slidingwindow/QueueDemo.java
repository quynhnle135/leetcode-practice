package com.quynh.slidingwindow;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> myQ = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            myQ.add(i);
        }
        System.out.println(myQ);
        int value = myQ.remove();
        System.out.println(value);
        System.out.println(myQ);
        myQ.remove();
        System.out.println(myQ);

        Set<Integer> mySet = new HashSet<>();
        for (int i = 1; i <= 10; i++) {
            mySet.add(i);
        }
        System.out.println(mySet);
        mySet.remove(1);
        System.out.println(mySet);
    }
}
