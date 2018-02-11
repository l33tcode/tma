package com.chaomeee;

import java.util.Stack;

/**
 * Created by tina on 2/10/18.
 * url: https://leetcode.com/problems/valid-parentheses/description/
 */
public class Solution20 {

    public boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }

        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();

    }
}