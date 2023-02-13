package q2;
//Given an integer x, return true if x is a palindrome and false otherwise.

//        Input: x = 121
//        Output: true
//        Explanation: 121 reads as 121 from left to right and from right to left.

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x == 0) {
            return true;
        }
        if (x % 10 == 0) {
            return false;
        }

        int otherHalfNum = 0;
        while (otherHalfNum < x) {
            int lastDegit = x % 10;
            x = x / 10;
            otherHalfNum = otherHalfNum * 10 + lastDegit;
        }
        return x == otherHalfNum || x == otherHalfNum / 10;
    }
}

// Time: O(logn) since x = x/10
// Space O(1)
