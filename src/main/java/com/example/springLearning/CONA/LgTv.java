package com.example.springLearning.CONA;

public class LgTv implements TV{

    @Override
    public void turnOn() {
        System.out.println("LGTV---전원 킨다.");
    }

    @Override
    public void turnOff() {
        System.out.println("LGTV--전원끈다.");

    }

    @Override
    public void volumeUp() {
        System.out.println("LGTV--소리 올린다.");

    }

    @Override
    public void volumeDown() {
        System.out.println("LGTV---소리가 감소한다.");
    }
}
