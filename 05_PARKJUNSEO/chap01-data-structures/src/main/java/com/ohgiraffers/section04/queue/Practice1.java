package com.ohgiraffers.section04.queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* 요세푸스 문제 - 백준(1158) */
public class Practice1 {

    public String solution (int n, int k) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            queue.offer(i+1);
        }

        List<String> answer = new LinkedList<>();

        while (!queue.isEmpty()) {
            for (int i = 0; i < k-1; i++) {
                queue.offer(queue.poll());
            }
            answer.add(queue.poll().toString());
        }
        return answer.toString();
    }
}
