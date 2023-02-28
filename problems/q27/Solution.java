package q27;

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
