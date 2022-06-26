package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class PersonLambdaExample {


    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("GC", "Chk", 10),
                new Person("Anthony", "Larson", 50),
                new Person("Dana", "Skula", 20),
                new Person("Adnan", "Md", 25),
                new Person("Hunter", "Lary", 30)
        );

        System.out.println("Initial List:");
        printConditionally(personList, p -> true);

        //Sort By Last Name
        System.out.println("Sorting With Last Name Lambda Expression");
        Collections.sort(personList, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));


        System.out.println("After Sorted By lastName");
        printConditionally(personList, p -> true);

        //Print All people have last name start with L
        System.out.println("Printing Only LastName StartWith L");
        printConditionally(personList, (p) -> p.getLastName().startsWith("L"));

        System.out.println("Printing Only LastName StartWith L");
        printConditionally(personList, (p) -> p.getLastName().startsWith("M"));

        System.out.println("Printing Only FirstName StartWith A");
        printConditionally(personList, p -> p.getFirstName().startsWith("A"));

        System.out.println("Printing All with Lambda");
        printConditionally(personList, (p) -> true);


        performConditionally(personList, p->true, p-> System.out.println(p.getFirstName()));
        performConditionally(personList, p->p.getFirstName().startsWith("G"), p-> System.out.println(p.getFirstName()));


    }


    private static void printConditionally(List<Person> personList, Predicate<Person> condition) {
        for (Person p : personList) {
            if (condition.test(p))
                System.out.println(p);
        }
        System.out.println("\n");
    }

    private static void performConditionally(List<Person> personList, Predicate<Person> condition, Consumer<Person> consumer) {
        for (Person p : personList) {
            if (condition.test(p))
                consumer.accept(p);
        }
        System.out.println("\n");
    }

}
