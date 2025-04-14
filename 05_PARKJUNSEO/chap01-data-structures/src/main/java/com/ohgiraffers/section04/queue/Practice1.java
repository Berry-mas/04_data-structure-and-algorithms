package com.ohgiraffers.section04.queue;

import java.util.LinkedList;
import java.util.Queue;

/* 요세푸스 문제 - 백준(1158) */
public class Practice1 {

    public String solution (int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < n; i++) {
            queue.offer(i+1);
        }

        for (int )
        return null;
    }
}
