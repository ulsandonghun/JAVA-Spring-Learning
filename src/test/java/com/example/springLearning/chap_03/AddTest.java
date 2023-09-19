package com.example.springLearning.chap_03;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTest {

    @Test
    @DisplayName("인터페이스를 상속받은 더하기 프로그램 테스트코드")
    void calculate() {
        //given
        Calculator calculator = new Add();
        int a = 0;
        int b = 3;
        int sum = 0;

        //when
        sum = calculator.calculate(0, 3);

        //then
        Assertions.assertThat(sum).isEqualTo(2);
    }
}