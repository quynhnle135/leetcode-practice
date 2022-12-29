package com.quynh.tree;

import java.util.Stack;

public class MaximumDepth {
    // recursion approach
    public static int findMaxDepth(TreeNode root) {
        // base case
        if (root == null) {
            return 0;
        }

        int left = findMaxDepth(root.left);
        int right = findMaxDepth(root.right);

        return Math.max(left, right) + 1;
    }

    // iteration approach
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Stack<Integer> values = new Stack<>();
        values.push(1);
        Stack<TreeNode> nodes = new Stack<>();
        int max = 0;
        nodes.push(root);
        while (!nodes.isEmpty()) {
            TreeNode node = nodes.pop();
            int temp = values.pop();
            max = Math.max(max, temp);

            if (node.left != null) {
                nodes.push(node.left);
                values.push(temp + 1);
            }

            if (node.right != null) {
                nodes.push(node.right);
                values.push(temp + 1);
            }
        }
        return  max;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(9);
        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(14);
        System.out.println(findMaxDepth(root)); // 3
        System.out.println(maxDepth(root)); // 3
    }
}
