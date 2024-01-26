package JAVA_language_practice.Siver4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BOJ1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = Integer.parseInt(str);
        int cnt=0;

        for (int i = 1; i <= num; i++) {
            cnt += judge(i);
        }

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
        for (int i = 0; i < array.length-1; i++) {
            int differ2 = array[i] - array[i + 1];
            if (differ != differ2) {
                //차이가 다르면 한수 아님
                return 0;
            }

        }
        return 1;

    }

}
