package JAVA_language_practice.Siver4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class BOJ2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "최 동훈";
//        String[] split = str.split(" ");
//        for (int i = 0; i < split.length; i++) {
//            System.out.println(split[i]);
//        }
        //위와 같은 역할을 하는 스트림과 람다 코드 그래서 StringTokenizer 대신 .split을 사용하자
        //자바에서도 레거시로 보고 split 사용을 지향한다.
//        Arrays.stream(str.split(" "))
//                .forEach(a-> System.out.println(a));


        int N = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(calculator(N)));
        bw.flush();
    }

    public static int calculator(int N) {
        int cnt=0;
        while (N % 5 != 0) {
            cnt+=N/5;
            N=cnt;
        }
        while (N % 3 != 0) {
            cnt+=N/3;

        }
        return cnt;
    }
}
