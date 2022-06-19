package designpattern.builder;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        Book book =  new Book.Builder("0-21-2","Java Complete Reff").build();

        Book book1 = new Book.Builder("20-21","AnotherBook").description("This is a description")
                                                                      .author("Myself").build();

        Book.Builder builder = new Book.Builder("20-90","No Title");
        Book book2 = builder.build();

        Book book3 = builder.description("something").build();

        System.out.println(book);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
