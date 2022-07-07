package javastream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExampleWithArraylist {

    Employee employee = new Employee("anna", 25, 6000);

    static List<Employee> list = Arrays.asList(
            new Employee("Anna", 25, 6000),
            new Employee("Charle", 30, 8000),
            new Employee("ABD", 30, 5000),
            new Employee("Gautam", 25, 10000),
            new Employee("Huizi", 20, 9200)
    );

    static void printHeightSalary(){
        list.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
//                .filter((e)->e.getName().startsWith("A"))
                .limit(3)
                .forEach(System.out::println);
    }


    static void groupingByAge(){
        Map<Integer,List<Employee>> map = list.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .collect(Collectors.groupingBy(e->e.getAge()));

        System.out.println(map.toString());

    }

    static void groupingByAgeCount(){
        Map<Integer,Long> map = list.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .collect(Collectors.groupingBy(Employee::getAge,Collectors.counting()));

        System.out.println(map.toString());

    }

    public static void main(String[] args) {
        printHeightSalary();
        groupingByAge();
        groupingByAgeCount();

     }
}
