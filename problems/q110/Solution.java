package q110;

import q94.TreeNode;

//Given a binary tree, determine if it is
//        height-balanced
//        .
//
//
//
//        Example 1:
//
//
//        Input: root = [3,9,20,null,null,15,7]
//        Output: true
//        Example 2:
//
//
//        Input: root = [1,2,2,3,3,null,null,4,4]
//        Output: false
//        Example 3:
//
//        Input: root = []
//        Output: true

public class Solution {
    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    public Integer height(TreeNode node){
        if (node == null){
            return 0;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        if (leftHeight == -1|| rightHeight == -1 || Math.abs(leftHeight-rightHeight)>1){
            return -1;
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
