package JAVA_language_practice.Siver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BOJ11047 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int N = arr[0];
        int K = arr[1];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(Integer.valueOf(br.readLine()));
        }
        //내림차순 정렬
        Collections.sort(list, (a, b) -> b.compareTo(a));
        int cnt = 0;

        for (int i = 0; i < list.size(); i++) {
            Integer num = list.get(i);
            //현재 값에서 나누기 가능한지 판단
            if (K / num != 0) {
                //나누기가 가능하면 나누기실행
                cnt += K / num;
                K %= num;
            }
        }
        System.out.println(cnt);


    }
}
