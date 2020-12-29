package questionfe94;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {

  public static void main(String[] args) {
    List<String> test = Arrays.asList("1das", "2asds", "3asd", "as");

    System.out.println(reverseEachString(test));
    System.out.println(reverseEachStringMonolithic(test));
    System.out.println(sqrtsOfFirstDigits(test));
    System.out.println(sqrtsOfFirstDigitsMonolithic(test));
  }

  public static List<String> reverseEachString(List<String> input) {
    return input
            .stream()
            .map(StringBuilder::new)
            .map(StringBuilder::reverse)
            .map(StringBuilder::toString)
            .collect(Collectors.toList());
  }

  public static List<String> reverseEachStringMonolithic(List<String> input) {
    return input
            .stream()
            .map(str -> new StringBuilder(str).reverse().toString())
            .collect(Collectors.toList());
  }

  public static List<Double> sqrtsOfFirstDigits(List<String> input) {
    return input
            .stream()
            .filter(str -> str.length() > 0 )
            .filter(str -> Character.isDigit(str.charAt(0)))
            .map(str -> Character.getNumericValue(str.charAt(0)))
            .map(Math::sqrt)
            .collect(Collectors.toList());
  }

  public static List<Double> sqrtsOfFirstDigitsMonolithic(List<String> input) {
    return input
            .stream()
            .filter(str -> str.length() > 0 && Character.isDigit(str.charAt(0)))
            .map(str -> Math.sqrt(Character.getNumericValue(str.charAt(0))))
            .collect(Collectors.toList());
  }

}
