package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class PersonExampleWithoutLambda {

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("GC", "Chk", 10),
                new Person("Anthony", "Larson", 50),
                new Person("Dana", "Skula", 20),
                new Person("Adnan", "Md", 25),
                new Person("Hunter", "Lary", 30)
        );

        System.out.println("Initial List:");
        printAll(personList);

        //Sort By Last Name
        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        System.out.println("After Sorted By lastName");
        printAll(personList);

        //Print All people have last name start with L
        System.out.println("Printing Only LastName StartWith L");
        printAllLastNameStartWithL(personList);

        printConditionally(personList, new Condition() {
            @Override
            public boolean isTrue(Person p) {
                if (p.getLastName().startsWith("M")){
                    return true;
                }else {
                    return false;
                }
            }
        });

    }


    private static void printAll(List<Person> personList) {
        for (Person p : personList) {
            System.out.println(p.toString());
        }
        System.out.println("\n");
    }

    private static void printAllLastNameStartWithL(List<Person> personList) {

        for (Person p : personList) {
            if (p.getLastName().startsWith("L"))
                System.out.println(p);
        }

        System.out.println("\n");
    }

    private static void printConditionally(List<Person> personList, Condition condition) {
        for (Person p : personList) {
            if (condition.isTrue(p))
                System.out.println(p);
        }

        System.out.println("\n");
    }

    interface Condition {
        boolean isTrue(Person p);
    }
}
