package q67;
//Given two binary strings a and b, return their sum as a binary string.
//
//
//
//        Example 1:
//
//        Input: a = "11", b = "1"
//        Output: "100"
//        Example 2:
//
//        Input: a = "1010", b = "1011"
//        Output: "10101"
public class Solution {
    public String addBinary(String a, String b) {
        int times = Math.max(a.length(), b.length());
        StringBuilder stringBuilder = new StringBuilder();
        int carry = 0;
        for (int index = times -1; index >= 0; index--) {
            char aValue;
            int result = carry;
            if (index < times - a.length()) {
                aValue = '0';
            } else {
                aValue = a.charAt(index - times + a.length());
            }
            result = result + (int) aValue - (int) '0';
            System.out.println(aValue);


            char bValue;

            if (index < times - b.length()) {
                bValue = '0';
            } else {
                bValue = b.charAt(index - times + b.length());
            }
            result = result + (int) bValue - (int) '0';
            System.out.println(bValue);

            if (result == 3) {
                stringBuilder.insert(0, "1");
                carry = 1;
            } else if (result == 2) {
                stringBuilder.insert(0, "0");
                carry = 1;
            } else {
                stringBuilder.insert(0, result);
                carry = 0;
            }
        }
        if (carry == 1) {
            stringBuilder.insert(0, "1");
        }
        return stringBuilder.toString();

    }
}
