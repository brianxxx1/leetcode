package q27;
//Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.
//        Input: nums = [3,2,2,3], val = 3
//        Output: 2, nums = [2,2,_,_]
//        Explanation: Your function should return k = 2, with the first two elements of nums being 2.
//        It does not matter what you leave beyond the returned k (hence they are underscores).
public class Solution {
    public int removeElement(int[] nums, int val) {
        int front = 0;
        int rear = 0;
        while (rear < nums.length){
            if (nums[rear] != val){
                nums[front] = nums[rear];
                front ++;
                rear ++;
            }else{
                rear ++;
            }
        }
        return front;
    }
}
