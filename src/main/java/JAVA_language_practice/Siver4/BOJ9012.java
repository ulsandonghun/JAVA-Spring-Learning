package JAVA_language_practice.Siver4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.IntStream;

public class BOJ9012 {
    private static final Stack<Character> stack = new Stack<>();
    private static final BufferedReader br
            = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw
            = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            char[] charArray = br.readLine().toCharArray();
            bw.write(judge(charArray)+"\n");

            stack.clear();
        }
        bw.flush();
        bw.close();

    }

    //스택에 직접 넣고 빼는 과정을 수행하고, VPS가 아니면 경고를 반환하는 기능
    public static boolean pushAndAlrert(char ch) {
        if (ch == '(') {
            stack.push(ch);
            return true;
        }
        //')'가 들어올 경우
        if (stack.empty()||stack.peek()==')') {
            return false;
        }
        stack.pop();
        return true;

    }
    //한줄입력마다 NO Yes를 출력하는 함수
    public static String judge(char[] chArr) {
        for (int i = 0; i < chArr.length; i++) {
            char ch = chArr[i];
            if (!pushAndAlrert(ch)) {
                return "NO";
            }
        }
        if (stack.empty()) {
            return "YES";
        }else {
            return "NO";
        }
    }
}
