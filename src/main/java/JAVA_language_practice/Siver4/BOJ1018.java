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
        int[] arr5 = {1,23};


        String input1 =
                        "BWBWBWBW\n" +
                        "WBWBWBWB\n" +
                        "BWBWBWBW\n" +
                        
                        "WBWBWBWB\n" +
                                
                        "BWBWBWBW\n" +
                        "WBWBWBWB\n" +
                        "BWBWBWBW\n"  +
                        "WBWBWBWB";

        String[] rows = input1.split("\n");
        char[][] board = new char[rows.length][rows[0].length()];

        for (int i = 0; i < rows.length; i++) {
            board[i] = rows[i].toCharArray();
        }
        String input2 =
                        "WBWBWBWB\n" +
                        "BWBWBWBW\n" +
                        "WBWBWBWB\n" +
                        "BWBBBWBW\n" +
                        "WBWBWBWB\n" +
                        "BWBWBWBW\n" +
                        "WBWBWBWB\n" +
                        "BWBWBWBW";

        String[] split= input2.split("\n");
        char[][] board1 = new char[split.length][split[0].length()];
        for (int i = 0; i < rows.length; i++) {
            board[i] = rows[i].toCharArray();
        }


    }
    //8*8으로 잘라내는 함수
    static void split(String[][] arr,char[]int N,int M) {
        int now_x=N-8;
        int now_y=M-8;
        int minimum=Integer.MAX_VALUE;


        for (int i = 0; i <= now_x; i++) {
            for (int j = 0; j <= now_y; j++) {
                //시작 값 으로부터 8*8 함수를 추출하는 함수
                char[][] extracted_arr = extract(arr, i, j);
                minimum=(minimum<count(extracted_arr,))


            }
        }


    }

    static char[][] extract(String[][] arr, int x, int y) {
        char[][] eight_arr = new char[8][8];

        int x_index = 0;
        int y_index = 0;

        for (int i = x; i < (x + 8); i++) {
            for (int j = y; j < (y + 8); j++) {
                eight_arr[x_index][y_index] = arr[i][j].charAt(0);
                y_index++;

            }
            x_index++;
        }
        return eight_arr;
    }

    static int count(char[][] target, char[][] answer) {
        int cnt=0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (target[i][j] != answer[i][j]) {
                    cnt++;
                }
            }
        }
        return cnt;

    }

    // 몇개가 다른지 세는 함수
}
