package com.example.springLearning.chap_03;

public class Sub implements Calculator{
    @Override
    public int calculate(int a, int b) {

        return (a>b)?a-b:b-a;
    }
}
