package q26;

import java.util.*;
//Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
//        The relative order of the elements should be kept the same.


//Input: nums = [1,1,2]
//        Output: 2, nums = [1,2,_]
//        Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
//        It does not matter what you leave beyond the returned k (hence they are underscores).

public class Solution {
    public int removeDuplicates(int[] nums) {
        int front = 0;
        int rear = 1;
        while (rear < nums.length){
            if (nums[front] != nums[rear]){
                    front ++;
                    nums[front] = nums[rear];
            }
            rear++;
        }
        return front + 1;
    }
}