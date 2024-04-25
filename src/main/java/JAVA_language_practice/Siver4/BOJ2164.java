package JAVA_language_practice.Siver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ2164 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        ArrayList<Integer> arr = new ArrayList<>();
        int num = Integer.valueOf(s);

        for (int i = 1; i <= num; i++) {
            arr.add(i);
        }
        LinkedList<Integer> list = new LinkedList<>(arr);


        while (list.size() != 1) {
            list.pop();
            list.add(list.pop());

        }

        System.out.println(list.pop());
    }
}
