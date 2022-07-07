package javastream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Practice {


    private static void printMinArray() {
        int[] num = {4, 5, 6, 8, 1, 2, 10, 8, 50, 0, 6, 3, 9};

        int min = IntStream.of(num).min().getAsInt();

        System.out.println(min);

        IntStream.of(num).min().ifPresent((m) -> System.out.println("min is : " + m));

        IntStream.of(num).average().ifPresent((m)-> System.out.println("Avg is : " + m) );
    }

    private static void distNumber() {
        int[] num = {4, 5, 6, 8, 1, 2, 10, 8, 50, 0, 6, 3,1, 9};

        int copy[] = Arrays.copyOf(num,num.length);

        IntStream.of(copy)
                .distinct()
                .filter((n)-> n%2==0)
                .sorted()
//                .skip(1)
                .limit(3)
                .skip(1)
                .forEach(System.out::println);

    }



    private static void printMinArray2() {
        int[] num = {4, 5, 6, 8, 1, 2, 10, 8, 50, 0, 6, 3, 9};

        int min = IntStream.of(num).min().getAsInt();

        System.out.println(min);
    }



    public static void main(String[] args) {

        printMinArray();
        distNumber();
    }
}
