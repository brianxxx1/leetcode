package q1;

import java.util.HashMap;
import java.util.Map;

//        Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//        You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//        You can return the answer in any order.


//        Example 1:
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].


public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (hashMap.containsKey(target - nums[i])){
                return new int[] {i, hashMap.get(target-nums[i])};
            }
            hashMap.put(nums[i],i);
        }
        return new int[0];
    }
}

// using hashmap.get to save one iteration to reduce big O from O(n^2) to O(n)
