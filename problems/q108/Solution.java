package q108;

import q94.TreeNode;

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sort(nums, 0, nums.length - 1);

    }

    public TreeNode sort(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (left + right) / 2;

        TreeNode node = new TreeNode(nums[mid]);

        node.left = sort(nums, left, mid - 1);
        node.right = sort(nums, mid + 1, right);

        return node;
    }
}

