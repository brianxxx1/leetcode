//package q20;
//
//import java.util.EmptyStackException;
//import java.util.Stack;
//
//public class Solution {
//    public boolean isValid(String s) {
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (c == '(' || c == '[' || c == '{') {
//                stack.push(c);
//            } else if (c == ')' || c == ']' || c == '}') {
//                Character pop;
//                try {
//                    pop = stack.pop();
//                } catch (EmptyStackException e) {
//                    return false;
//                }
//
//                switch (c) {
//                    case ')' -> {
//                        if (pop != '(') return false;
//                    }
//                    case ']' -> {
//                        if (pop != '[') return false;
//                    }
//                    case '}' -> {
//                        if (pop != '{') return false;
//                    }
//                    default -> {
//                    }
//                }
//            }
//        }
//        return stack.empty();
//    }
//}
