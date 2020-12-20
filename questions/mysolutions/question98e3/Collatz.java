package question98e3;

public class Collatz {

    /**
     * Program which generates the Collatz sequence
     */
    public static void main(String[] args) {

        assert args.length == 1;

        int start = Integer.parseInt(args[0]);

        System.out.print(start);

        while (start != 1) {
            start = next(start);
            System.out.print(" " + start);
        }
    }

    private static int next(int x) {
        return (x % 2 == 0) ? (x / 2) : (3 * x + 1);
    }
}
