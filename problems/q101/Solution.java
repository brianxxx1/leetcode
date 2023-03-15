package q101;

//Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
//
//
//
//        Example 1:
//
//
//        Input: root = [1,2,2,3,4,4,3]
//        Output: true
//        Example 2:
//
//
//        Input: root = [1,2,2,null,3,null,3]
//        Output: false


import q94.TreeNode;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root==null){
            return true;
        }
        return compare(root.left, root.right);
    }
    public boolean compare(TreeNode left, TreeNode right){
        if (left == null && right == null){
            return true;
        }else if (left == null || right == null){
            return false;
        } else if (left.val != right.val){
            return false;
        } else {
            return compare(left.left, right.right) && compare(left.right, right.left);
        }
    }
}
