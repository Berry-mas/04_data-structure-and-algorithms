package com.ohgiraffers.section04.dp;

import java.util.Arrays;

public class B_SugarDelivery {

    // 최대값 상수를 지정
    static final int INF = 9999;

    public static int solution (int n) {
        /* dp 배열의 인덱스 값이 곧 해당 kg의 봉지 개수가 도리 수 있도록 저장 */
        int[] dp = new int[n + 1];

        /* 배열의 모든 값 초기화 */
        /* 모든 값을 INF 값으로 초기화 */
        Arrays.fill(dp, INF);

        /* 두 조건에 따른 이항 점화식이므로 두 항의 초기값을 설정해줌 */
        if (n>= 3) dp[3] = 1;
        if (n >= 5) dp[5] = 1;

        for (int i = 6; i <= n; i++) {
            dp[i] = Math.min(dp[i - 3], dp[i - 5]) + 1;
        }

        return dp[n] >= INF ? -1 : dp[n];



    }
}
