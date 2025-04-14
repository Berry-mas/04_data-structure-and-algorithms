package com.ohgiraffers.section03.stack;

import java.util.Stack;
// 비효율적이고 틀린 코드!!!!!!!!!!!!!!!
public class Practice1_MyAnswer {
    // 실제로 코드를 구현
    public String solution(String input) {
        Stack<Character> stack = new Stack<>();
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            stack.push(chars[i]);
        }

        int countOfLeft = 0;
        int countOfRight = 0;
        int countHalfLeft = 0;
        int countHalfRight = 0;


        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                countOfLeft++;
            } else {
                countOfRight++;
            }
        }

        for (int i = 0; i < (chars.length + 1) / 2; i++) {
            if (chars[i] == '(') {
                countHalfLeft++;
            } else {
                countHalfRight++;
            }
        }

        if (chars[0] == ')' || chars[chars.length - 1] == '(' || chars.length % 2 == 1 || countOfLeft != countOfRight) {
            return "NO";
        } else if (countHalfRight != countHalfLeft) {
            return "NO";
        } else {
            return "YES";
        }
    }
}
