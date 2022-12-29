package com.quynh.tree;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        // Constructor
        public TreeNode() {}

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static List<Integer> inOrderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inOrderTraversal(root, result);
        return result;
    }

    public static void inOrderTraversal(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }

        inOrderTraversal(node.left, list);
        list.add(node.val);
        inOrderTraversal(node.right, list);
    }

    public static List<Integer> preOrderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preOrderTraversal(root, result);
        return result;
    }

    public static void preOrderTraversal(TreeNode node, List<Integer> list) {
        // base case
        if (node == null) {
            return;
        }
        list.add(node.val);
        preOrderTraversal(node.left, list);
        preOrderTraversal(node.right, list);
    }

    public static List<Integer> postOrderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postOrderTraversal(root, result);
        return result;
    }

    public static void postOrderTraversal(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }

        postOrderTraversal(node.left, list);
        postOrderTraversal(node.right, list);
        list.add(node.val);
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(6);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(9);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(1);

        List<Integer> treeInorderTraversal = inOrderTraversal(root);
        for (Integer n : treeInorderTraversal) {
            System.out.print(n + " ");
        }
        System.out.println();

        List<Integer> treePreOrderTraversal = preOrderTraversal(root);
        for (Integer n : treePreOrderTraversal) {
            System.out.print(n + " ");
        }
        System.out.println();

        List<Integer> treePostOrderTraversal = postOrderTraversal(root);
        for (Integer n : treePostOrderTraversal) {
            System.out.print(n + " ");
        }
    }
}
