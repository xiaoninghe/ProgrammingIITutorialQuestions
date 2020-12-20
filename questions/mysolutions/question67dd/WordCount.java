package question67dd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordCount {

    /**
     * Word counting
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        String line;

        // This is an ugly but legal, and widely used, way to save one line of code for reading processing input
        while ((line = br.readLine()) != null) {
            lineCount++;
            boolean wordIsEmpty = true;
            for (int i = 0; i < line.length(); i++) {
                char curChar = line.charAt(i);
                if (Character.isLetterOrDigit(curChar)) {
                    charCount++;
                    wordIsEmpty = false;
                } else {
                    if (!wordIsEmpty) {
                        wordCount++;
                        wordIsEmpty = true;
                    }
                }
            }
        }

        System.out.println("Lines: " + lineCount);
        System.out.println("Words: " + wordCount);
        System.out.println("Characters: " + charCount);
    }
}
