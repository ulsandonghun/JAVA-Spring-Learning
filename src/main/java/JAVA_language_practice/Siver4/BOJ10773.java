package JAVA_language_practice.Siver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Stack;

public class BOJ10773 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = getinput(br);
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
             int k = getinput(br);

            if (k == 0 && !stack.isEmpty()) {
                stack.pop();
            } else {
                stack.push(k);
            }
        }
        int sum = stack.stream()
                .mapToInt(i -> i)
                .sum();
        System.out.println(sum);
    }

    private static Integer getinput(BufferedReader br) throws IOException {
        return Integer.valueOf(br.readLine());
    }
}
