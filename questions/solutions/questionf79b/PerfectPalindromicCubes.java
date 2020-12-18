package questionf79b;

import java.math.BigInteger;

public class PerfectPalindromicCubes {

    /**
     * Outputs Perfect Palindromic Cubes
     */
    public static void main(String[] args) {
        printPerfectPalindromicCubes(new BigInteger("1500"));
    }

    private static void printPerfectPalindromicCubes(BigInteger max) {
        for (BigInteger n = BigInteger.ZERO; n.compareTo(max) < 0; n = n.add(BigInteger.ONE)) {
            BigInteger cube = n.pow(3);
            if (isPalindrome(String.valueOf(cube))) {
                System.out.println(n + " cubed is " + cube);
            }
        }
    }

    private static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
