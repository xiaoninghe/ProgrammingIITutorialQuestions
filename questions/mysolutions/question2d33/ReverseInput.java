package question2d33;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseInput {

    /**
     * Stack-based line reversal
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<String> deque = new ArrayDeque<>();

        String line = br.readLine();
        while (line != null) {
            deque.push(line);
            line = br.readLine();
        }

        while (!deque.isEmpty()) {
            System.out.println(deque.pop());
        }
    }
}
