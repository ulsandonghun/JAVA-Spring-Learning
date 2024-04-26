package JAVA_language_practice.Siver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class BOJ1018 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] input = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int N=input[0];
        int M = input[1];
        String[][] arr = new String[N][M];
        for (int i = 0; i < N; i++) {
            arr[i]= br.readLine().split("");
        }
        for (String[] row : arr) {
            System.out.println(Arrays.toString(row));
        }


    }
    //8*8으로 잘라내는 함수
    static void split(String[][] arr,int N,int M) {
        int now_x=0;
        int now_y=0;

        while (true) {
            String[][] new_arr=new String[8][8];
            if (now_x + 7 > N || now_y + 7 > M) {
                break;
            }
            for (int i = now_x; i < now_x+7; i++) {
                for (int j =now_y; i < now_y+7; j++) {
                    new_arr
                }
            }


        }

    }

    // 몇개를 칠해야하는지 세는 함수
}
