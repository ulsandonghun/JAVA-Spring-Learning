package JAVA_language_practice.Siver4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BOJ10828 {

    private static Stack<String> stack = new Stack<>();
   private static BufferedReader br
           = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw
            = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] starr = br.readLine().split(" ");
            checkAndOperate(starr);
        }
        bw.flush();
        bw.close();

    }

    public static void checkAndOperate(String[] strarr) throws IOException {
        String order = strarr[0];
        switch (order) {
            case "push":
                stack.push(strarr[1]);
                break;
            case "pop":
                if(isEmpty())
                    break;
                bw.write(stack.pop()+"\n");
                break;
            case "size":
                bw.write(stack.size()+"\n");
                break;
            case "empty":
                bw.write((stack.empty()?1:0) + "\n");
                break;
            case "top":
                if(isEmpty())
                    break;
                bw.write(stack.peek() + "\n");
                break;
        }

    }

    public static boolean isEmpty() throws IOException {
        if(stack.isEmpty()){
            bw.write("-1" + "\n");
            return true;
        }
        return false;
    }
}
