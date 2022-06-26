package lambda;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("GC", "Chk", 10),
                new Person("Anthony", "Larson", 50),
                new Person("Dana", "Skula", 20),
                new Person("Adnan", "Md", 25),
                new Person("Hunter", "Lary", 30)
        );

        for (Person p: personList){
            System.out.println(p);
        }

        System.out.println();
        personList.forEach(p-> System.out.println(p.getFirstName()));

        System.out.println();
        personList.forEach(System.out::println);

        System.out.println();
        personList.forEach( CollectionIterationExample::filter);

    }

    private static void filter(Person p){
        if (p.getFirstName().startsWith("A")){
            System.out.println(p);
        }
    }
}
