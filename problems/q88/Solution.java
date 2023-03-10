package q88;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr1 = m -1;
        int ptr2 = n -1;
        int rear = nums1.length - 1;
        while (ptr1>=0 || ptr2>=0){
            if (ptr2 < 0){
                break;
            }
            else if (ptr1<0){
                nums1[rear] = nums2[ptr2];
                rear --;
                ptr2--;
            }
            else if (nums2[ptr2] >= nums1[ptr1]){
                nums1[rear] = nums2[ptr2];
                rear --;
                ptr2--;
            }else{
                nums1[rear] = nums1[ptr1];
                rear --;
                ptr1 --;
            }
        }
    }
}
