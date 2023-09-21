package com.example.springLearning.CONA;

public class TVUser {
    public static void main(String[] args) {
        System.out.println("201912344 최동훈");

        BeanFactory beanFactory = new BeanFactory();

        TV tv = (TV) beanFactory.getBean(args[0]);
        tv.turnOn();
        tv.volumeUp();
        tv.volumeDown();
        tv.turnOff();
    }
}
