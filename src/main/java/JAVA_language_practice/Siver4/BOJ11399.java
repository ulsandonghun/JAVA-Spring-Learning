package JAVA_language_practice.Siver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BOJ11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        //입력된 문자를 정수배열로 변경
        int[] input = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        //정수배열을 위칫값과 걸린시간값을 저장

        Arrays.sort(input);
        int sum=0;

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j <= i; j++) {
                //가장 중요한 부분 : j 변수 입장으로 처음부터 누적저장
                sum+=input[j];

            }

        }
        System.out.println(sum);

    }
}
