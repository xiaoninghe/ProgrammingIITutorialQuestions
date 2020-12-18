package questionf7c3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PigLatin {

    /**
     * Pig Latin translator
     */
    public static void main(String[] args) throws IOException {

        System.out.println("Please enter your text:");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        String line = reader.readLine();
        while (line != null) {
            stringBuilder.append(transformLineToPigLatin(line)).append('\n');
            line = reader.readLine();
        }

        System.out.println(stringBuilder);
    }

    private static String transformLineToPigLatin(String line) {

        StringBuilder lineBuilder = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < line.length(); i++) {
            char currentChar = line.charAt(i);
            if (Character.isLetterOrDigit(currentChar)) {
                word.append(currentChar);
            } else {
                lineBuilder.append(transformWordToPigLatin(word.toString())).append(currentChar);
                word = new StringBuilder();
            }
        }

        return lineBuilder.toString();
    }

    private static String transformWordToPigLatin(String word) {
        if (word.length() == 0) return word;

        char firstChar = word.charAt(0);
        if (!Character.isLetterOrDigit(firstChar) || Character.isDigit(firstChar)) {
            return word;
        }

        if (isVowel(firstChar)) {
            return word + "way";
        }

        if (word.length() > 1) {
            return (Character.isUpperCase(firstChar))
                    ? word.substring(1, 2).toUpperCase() + word.substring(2) + Character.toLowerCase(firstChar) + "ay"
                    : word.charAt(1) + word.substring(2) + firstChar + "ay";
        }
        return word + "ay";
    }

    private static boolean isVowel(char c) {
        return switch (Character.toLowerCase(c)) {
            case 'a', 'e', 'i', 'o', 'u' -> true;
            default -> false;
        };
    }
}
