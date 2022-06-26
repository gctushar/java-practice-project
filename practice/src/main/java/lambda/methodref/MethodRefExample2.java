package lambda.methodref;

import lambda.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodRefExample2 {


    public static void main(String[] args) {

        MethodRefExample2 methodRefExample2 = new MethodRefExample2();
        List<Person> personList = Arrays.asList(
                new Person("GC", "Chk", 10),
                new Person("Anthony", "Larson", 50),
                new Person("Dana", "Skula", 20),
                new Person("Adnan", "Md", 25),
                new Person("Hunter", "Lary", 30)
        );


        performConditionally(personList, p -> true, System.out::println);


//        performConditionally(personList, p -> p.getFirstName().startsWith("G"), p -> System.out.println(p.getFirstName()));

        Collections.sort(personList, Comparator.comparing(Person::getLastName));

        printNameAndAge(personList, methodRefExample2::testMethodRef);

    }

    private static void performConditionally(List<Person> personList, Predicate<Person> condition, Consumer<Person> consumer) {
        for (Person p : personList) {
            if (condition.test(p))
                consumer.accept(p);
        }
        System.out.println("\n");
    }

    private static void printNameAndAge(List<Person> personList, Consumer<Integer> consumer) {
        System.out.println("\n");
        for (Person p : personList) {
            System.out.println(p.getFirstName());
            consumer.accept(p.getAge());
        }

    }


    private void testMethodRef(int age) {
        System.out.println("Printing the age: " + age);
    }

}
