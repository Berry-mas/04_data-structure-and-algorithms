package com.ohgiraffers.section03.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.StringTokenizer;

public class B_CoinChange {

    public static int solution(String input) throws IOException {
        BufferedReader br  = new BufferedReader(new StringReader(input));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int coinKindsCount = Integer.parseInt(st.nextToken());    // 동전의 종류 개수
        int coinSum = Integer.parseInt(st.nextToken());           // 계산 금액
        int[] coins = new int[coinKindsCount];

        for (int i = 0; i < coins.length; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;  // 필요한 동전의 개수


        for (int i = coinKindsCount-1; i >=0; i--) {
            if(coins[i] <= coinSum) {
                count += coinSum/coins[i];
                coinSum %= coins[i];        // 방금 지불하고 남은 금액
            }
        }
        return count;
    }
}
