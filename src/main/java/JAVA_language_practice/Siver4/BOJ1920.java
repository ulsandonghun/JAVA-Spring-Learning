package JAVA_language_practice.Siver4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class BOJ1920 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] list = new int[N];

        for (int i = 0; i < N; i++) {
            list[i] = sc.nextInt();
        }
        Arrays.sort(list);

        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            int num = sc.nextInt();
            if (Arrays.binarySearch(list, num) >= 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }



}
