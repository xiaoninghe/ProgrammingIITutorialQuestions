package question4c70;

import java.util.*;

public class LotteryNumbers {

    private static final int NUM_NUMBERS = 7;
    private static final int UPPER_BOUND = 49;
    private static final int LOWER_BOUND = 1;

    /**
     * Outputs generates lottery numbers
     */
    public static void main(String[] args) {
        List<Integer> lotteryNumbers = new ArrayList<>(generateLotteryNumbers());

        for (int i = 1; i <= NUM_NUMBERS; i++) {
            if (i == NUM_NUMBERS) {
                System.out.println("Bonus Number: " + lotteryNumbers.get(i - 1));
            } else {
                System.out.println("Number " + i + ": " + lotteryNumbers.get(i - 1));
            }
        }
    }

    private static Set<Integer> generateLotteryNumbers() {
        Set<Integer> numbers = new HashSet<>();
        Random generator = new Random();

        while (numbers.size() < NUM_NUMBERS) {
            int num =  generator.nextInt(UPPER_BOUND + 1 - LOWER_BOUND) + LOWER_BOUND;
            numbers.add(num);
        }

        return numbers;
    }

}
