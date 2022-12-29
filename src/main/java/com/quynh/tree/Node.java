package com.quynh.tree;

public class Node {
    int key;
    String name;
    Node leftChild;
    Node rightChild;

    // Constructor
    public Node(int key, String name) {
        this.key = key;
        this.name = name;
    }
}
