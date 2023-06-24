package com.example.springLearning.chap_03;

import java.util.Scanner;

public class Call {




    public static void main(String[] args) {
//        Calculator calculator = new Add();
Calculator calculator =new Sub();
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result= calculator.calculate(a,b);
        System.out.println(result);
    }
}
