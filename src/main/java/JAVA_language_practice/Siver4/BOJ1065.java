package JAVA_language_practice.Siver4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.stream.IntStream;

public class BOJ1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int cnt = IntStream.rangeClosed(1, num)
//                .map(BOJ1065::judge) 함수참조또는 람다표현식 이용 아래의 코드와 같은역할
                .map(i->judge(i))
                .sum();


        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        bufferedWriter.write(String.valueOf(cnt));
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    //한수인지 판별하는 함수
    public static int judge(int n) {
        if (n / 100 == 0) {
            //첫째자리와 둘째자리(십의자리 수)는 무조건 한수
            return 1;
        }
        String s = String.valueOf(n);
        int[] array = Arrays.stream(s.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        int differ = array[0] - array[1];

       return IntStream.range(0, array.length - 1)
                .map(i -> array[i] - array[i + 1])
                .allMatch(i -> i == differ) ? 1 : 0;
    }

}
