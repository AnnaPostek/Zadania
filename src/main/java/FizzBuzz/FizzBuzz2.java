package FizzBuzz;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FizzBuzz2 {
    public static void main(String[] args) {
       IntStream.rangeClosed(0,100).forEach(i -> {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println(i + "FizzBuzz");
            else if (i % 3 == 0)
                System.out.println(i + "Fizz");
            else if (i % 5 == 0)
                System.out.println(i + "Buzz");
            else
                System.out.println(i);
        });

    }
    }
