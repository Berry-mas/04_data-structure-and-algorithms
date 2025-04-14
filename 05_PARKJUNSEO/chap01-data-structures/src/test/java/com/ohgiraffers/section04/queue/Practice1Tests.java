package com.ohgiraffers.section04.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/* 요세푸스 문제 - 백준(1158) */
class Practice1Tests {

    com.ohgiraffers.section04.queue.Practice1 practice1;

    @BeforeEach
    void setUp() {
        practice1 = new com.ohgiraffers.section04.queue.Practice1();
    }

    static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.arguments(7, 3);
        );
    }

    @DisplayName("요세푸스 문제 테스트")
    @Timeout(value = 2000, unit = TimeUnit.MILLISECONDS)    // 1초 안에 풀겠다는 뜻
    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testParenthesisString (int n, String expected) {
        String result = practice1.solution(input);
        Assertions.assertEquals(expected, result);
    }
}