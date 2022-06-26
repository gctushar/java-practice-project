package lambda;

import java.util.Arrays;
import java.util.List;

public class StreamExample {

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("GC", "Chk", 10),
                new Person("Anthony", "Larson", 50),
                new Person("Dana", "Skula", 20),
                new Person("Adnan", "Md", 25),
                new Person("Hunter", "Lary", 30)
        );

        personList.stream()
                .filter(person -> person.getFirstName().startsWith("A"))
                .filter(p -> p.getAge() >30)
                .forEach(System.out::println);

        Long count = personList.stream()
                .filter(person -> person.getFirstName().startsWith("A"))
                .filter(p -> p.getAge() >30).count();




        System.out.println(count);
    }
}
