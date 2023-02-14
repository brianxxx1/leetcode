package q13;

// Given a roman numeral, convert it to an integer.

//        Example 1:
//        Input: s = "III"
//        Output: 3
//        Explanation: III = 3.
//        Example 2:
//
//        Input: s = "LVIII"
//        Output: 58
//        Explanation: L = 50, V= 5, III = 3.
//        Example 3:
//
//        Input: s = "MCMXCIV"
//        Output: 1994
//        Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

public class Solution {
    public int romanToInt(String s) {
        int returnValue = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1) {
                returnValue = returnValue + getInteger(s.charAt(i));
                return returnValue;
            }
            if (getInteger(s.charAt(i)) < getInteger(s.charAt(i + 1))) {
                returnValue = returnValue - getInteger(s.charAt(i));
            } else {
                returnValue = returnValue + getInteger(s.charAt(i));
            }
        }

        return returnValue;
    }

    private Integer getInteger(Character c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }

    }
}


// Time: O(n) since for loop