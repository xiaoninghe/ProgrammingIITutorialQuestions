package questiond3f5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {

  public static Stream<Integer> restrictToPositiveIntegers(Stream<Number> numbers) {
    return numbers
            .filter(num -> num instanceof Integer)
            .map(num -> (Integer) num)
            .filter(num -> num > 0);
  }

  public static Stream<Integer> restrictToPositiveIntegersBoundedWildcard(Stream<? extends Number> numbers) {
    return numbers
            .filter(num -> num instanceof Integer)
            .map(num -> (Integer) num)
            .filter(num -> num > 0);
  }

  public static void main(String[] args) {

    final List<Number> numbers = Arrays.asList(
            5,
            2,
            3.0f,
            -20.0,
            (short) -1,
            -12,
            -200,
            200,
            0);

    final List<Double> floats = Arrays.asList(
            10.0,
            -20.0,
            31.0,
            412.34);

    final List<Integer> integers = Arrays.asList(
            1,
            -1,
            2,
            -2,
            3,
            -3,
            4,
            -4,
            0);

    System.out.println("Positive integers from " + numbers + " are: "
            + restrictToPositiveIntegers(numbers.stream()).collect(Collectors.toList()));

    // Think about why the following would not compile:
    // System.out.println("Positive integers from " + floats + " are: "
    //         + restrictToPositiveIntegers(floats.stream()).collect(Collectors.toList()));

    // ... and the following:
    // System.out.println("Positive integers from " + integers + " are: "
    //         + restrictToPositiveIntegers(integers.stream()).collect(Collectors.toList()));

    System.out.println("Positive integers from " + floats + " are: "
            + restrictToPositiveIntegersBoundedWildcard(floats
            .stream())
            .collect(Collectors.toList()));
    System.out.println("Positive integers from " + integers + " are: "
            + restrictToPositiveIntegersBoundedWildcard(integers
            .stream())
            .collect(Collectors.toList()));

  }

}
