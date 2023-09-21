package com.example.springLearning.CONA;

public class BeanFactory {
    public Object getBean(String bean) {
        if (bean.equals("samsung")) {
            return new SamsungTV();
        }
        else{
            return new LgTv();
        }
    }
}
