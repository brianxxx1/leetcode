package q14;
//Write a function to find the longest common prefix string anmongst an array of strings.
//
//If there is no common prefix, return an empty string "".
//
//Example 1:
//
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
//Example 2:
//
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        for (int j = 0; j < strs[0].length(); j++) {
            char c = strs[0].charAt(j);
            for (int i = 1; i < strs.length; i++) {
                char nextC;
                try {
                    nextC = strs[i].charAt(j);
                } catch (StringIndexOutOfBoundsException e) {
                    return strs[0].substring(0, j);
                }
                if (nextC != c) {
                    return strs[0].substring(0, j);
                }
            }
        }
        return strs[0];
    }
}
