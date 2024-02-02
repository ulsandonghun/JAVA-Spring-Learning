package JAVA_language_practice.Siver4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UncheckedIOException;
import java.util.Stack;
import java.util.stream.IntStream;

public class BOJ10828 {

    private static Stack<String> stack = new Stack<>();
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());

        IntStream.range(0, n)
                .mapToObj(i -> {
                    try {
                        return br.readLine().split(" ");
                    } catch (IOException e) {
                        throw new UncheckedIOException(e);
                    }
                })
                .forEach(BOJ10828::checkAndOperate);

        bw.flush();
        bw.close();
    }

    public static void checkAndOperate(String[] strarr) {
        String order = strarr[0];
        switch (order) {
            case "push":
                stack.push(strarr[1]);
                break;
            case "pop":
                if (!stack.isEmpty()) {
                    try {
                        bw.write(stack.pop() + "\n");
                    } catch (IOException e) {
                        throw new UncheckedIOException(e);
                    }
                } else {
                    write("-1");
                }
                break;
            case "size":
                write(String.valueOf(stack.size()));
                break;
            case "empty":
                write(stack.empty() ? "1" : "0");
                break;
            case "top":
                if (!stack.isEmpty()) {
                    write(stack.peek());
                } else {
                    write("-1");
                }
                break;
        }
    }

    private static void write(String value) {
        try {
            bw.write(value + "\n");
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}