package lambda;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 0};
        int key = 2;

        process(numbers, key, (a, b) -> System.out.print(a + b));
        process(numbers, key, (a, b) -> System.out.println(a / b));
        process(numbers, 0, (a, b) -> {
            try {
                System.out.println(a / b);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        });

        process(numbers, 2, wrapperLambda((a, b) -> System.out.println(a * b)));
        process(numbers, 0, wrapperLambda((a, b) -> System.out.println(a / b)));

    }

    private static void process(int[] numbers, int key, BiConsumer<Integer, Integer> consumer) {
        for (int i : numbers) {
            consumer.accept(i, key);
        }
        System.out.println();
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
//        return (k, v) -> System.out.println(k + v);

        System.out.println("Executing from Wrapper Lambda");
        return (k, v) -> {
            try {
                consumer.accept(k, v);
            } catch (ArithmeticException e) {
                System.out.println("Wrapper Lambda " + (e.getMessage()));
            }
        };
    }
}
