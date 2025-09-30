package ru.job4j.algo.stack;

import java.util.Stack;

public class Brackets {

    public boolean isValid(String s) {
        if (s.length() == 1) {
            return false;
        }
        if (s.isEmpty()) {
            return true;
        }

        Stack<Character> stack = new Stack<Character>();
        boolean result = true;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{') {
                stack.push('}');
            } else if (s.charAt(i) == '[') {
                stack.push(']');
            } else if (s.charAt(i) == '(') {
                stack.push(')');
            } else {
                if (stack.empty()) {
                    result = false;
                    break;
                } else
                    if (s.charAt(i) != stack.pop()) {
                        result = false;
                        break;
                    }
            }
        }
        return result;
    }
}
