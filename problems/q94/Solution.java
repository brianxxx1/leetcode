package q94;
//Given the root of a binary tree, return the inorder traversal of its nodes' values.
//
//
//
//        Example 1:
//        Input: root = [1,null,2,3]
//        Output: [1,3,2]
//        Example 2:
//
//        Input: root = []
//        Output: []
//        Example 3:
//
//        Input: root = [1]
//        Output: [1]

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> integers = new ArrayList<>();
        Stack<Object> stack = new Stack<>();
        if (root == null) {
            return integers;
        }
        stack.push(root);
        while (!stack.isEmpty()) {
            Object pop = stack.pop();
            if (pop instanceof TreeNode) {
                TreeNode node = (TreeNode) pop;
                if (node.right != null) {
                    stack.push(node.right);
                }
                stack.push((node.val));
                if (node.left != null) {
                    stack.push(node.left);
                }
            } else {
                integers.add((Integer) pop);
            }
        }
        return integers;
    }
}
