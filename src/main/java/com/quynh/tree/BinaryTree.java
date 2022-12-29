package com.quynh.tree;

import com.quynh.recursion.Palindrome;

public class BinaryTree {
    static Node root;

    public static void addNode(int key, String name) {
        Node newNode = new Node(key, name);
        if (root == null) {
            root = newNode;
        }
        else {
            Node focusNode = root;
            Node parent;
            while(true) {
                parent = focusNode;
                if (key < focusNode.key) {
                    focusNode = focusNode.leftChild;
                    if (focusNode == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    focusNode = focusNode.rightChild;
                    if (focusNode == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public static void inOrderTraversal(Node root) {
        if (root != null) {
            inOrderTraversal(root.leftChild);
            System.out.println(root.key);
            inOrderTraversal(root.rightChild);
        }
    }

    public static void preOrderTraversal(Node root) {
        if (root != null) {
            System.out.println(root.key);
            preOrderTraversal(root.leftChild);
            preOrderTraversal(root.rightChild);
        }
    }

    public static void postOrderTraversal(Node root) {
        if (root != null) {
            postOrderTraversal(root.leftChild);
            postOrderTraversal(root.rightChild);
            System.out.println(root.key);
        }
    }


    public static void main(String[] args) {

    }
}




