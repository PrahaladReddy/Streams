import java.sql.SQLIntegrityConstraintViolationException;
import java.util.*;
import java.util.stream.Collectors;

public class streams {
   public static void main(String[] args) {
      // Find the sum of all even numbers in a list of integers.
      List<Integer>  digits = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
      int sum = digits.stream()
              .mapToInt( i -> i )
              .sum();
      System.out.println(sum);

      //  Find and print the count of strings that have length greater than 5.
      List<String> str = Arrays.asList("banana", "prahalad", "hinge", "uhk");
      System.out.println(str.stream().filter(i -> i.length() > 5).count());

      //  Implement a function that takes a list of integers as input and returns a new list containing the square of each element.
      List<Integer>  integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
      List<Integer> squares = integers.stream()
              .map(i -> i * i)
              .collect(Collectors.toList());
      System.out.println(squares);

      // Find the maximum element in a list of integers.
      List<Integer>  findMax = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
      int max = findMax.stream().max(Integer::compare).get();
      System.out.println(max);

      // Concatenate all the strings in a list into a single string.
      List<String> bigString = Arrays.asList("banana", "prahalad", "hinge", "uhk","jessica");
      String combinedString = bigString.stream().collect(Collectors.joining(" "));
      System.out.println(combinedString);

      //Convert each string to uppercase and then sort them in alphabetical order.
      List<String> regularCase = Arrays.asList("banana", "prahalad", "hinge", "uhk","jessica");
      regularCase.stream().map(String::toUpperCase).sorted().forEach(System.out::println);

      // Find the average of all the numbers in a list of doubles using Streams.
      List<Double> Doubles = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0);
      double asDouble = Doubles.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
      System.out.println(asDouble);

      //Create a new list that contains only unique words (remove duplicates).
      List<String> duplicateString = Arrays.asList("banana", "prahalad", "hinge", "uhk","jessica", "uhk");
      List<String> uniqueStrings = bigString.stream().distinct().collect(Collectors.toList());
      System.out.println(uniqueStrings);

      //Check if all elements in a List satisfy a given condition using streams.
      List<Integer> evenNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
      boolean isEven = evenNumbers.stream().allMatch(e -> e % 2 == 0);
      System.out.println("Are all numbers even? " + isEven);

      //Check if a list contains a specific element using streams.
      List<Integer> eNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
      boolean exists = evenNumbers.stream().anyMatch(i -> i.equals(3));
      System.out.println(exists);

      //Find the longest string in a list using streams.
      List<String> longestString = Arrays.asList("banana", "prahalad", "hinge", "uhk","jessica", "uhk");
      longestString.stream().mapToInt(String::length).max()
              .ifPresent(System.out::println);

      //Remove null values from a list using streams.
      List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6,null, 7, 8, 9, 10);
      List<Integer> num = numbers.stream().filter(Objects::nonNull)
              .collect(Collectors.toList());
      System.out.println(num);

      //Problem Statement: GROUP BY Department and Find Max Salary

      //Find Second Smallest Element in a List
      List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
      Optional<Integer> min1 = numbers2.stream().sorted().skip(1).findFirst();
      System.out.println(min1);

      //Find Intersection of Two Lists
      List<Integer> int1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
      List<Integer> int2 = Arrays.asList(1, 2, 3, 4, 23, 6, 7, 96, 9, 10);

      List<Integer> intersection = int1.stream().filter(int2::contains).collect(Collectors.toList());
      System.out.println(intersection);
   }

}
