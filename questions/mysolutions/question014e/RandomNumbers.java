package question014e;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomNumbers {

    /**
     * Generates and outputs random numbers
     */
    public static void main(String[] args) {

        assert args.length == 1;

        int maxNumber = Integer.parseInt(args[0]);

        Set<Integer> generatedNumbers = new HashSet<>();
        Random generator = new Random();

        System.out.println("Generating random numbers:");

        int num = generator.nextInt(maxNumber);
        int count = 1;
        System.out.print(num);
        while (generatedNumbers.size() < maxNumber) {
            num = generator.nextInt(maxNumber);
            generatedNumbers.add(num);
            System.out.print(", " + num);
            count++;
        }

        System.out.println();
        System.out.println("I had to generate " + count
                + " random numbers between 0 and " + maxNumber
                + " to have produced all such numbers at least once.");
    }
}
