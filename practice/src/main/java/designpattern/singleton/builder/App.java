package designpattern.singleton.builder;

public class App {

    public static void main(String[] args) {
        Book book = new Book.Builder("0-21-2","Java Complete Reff").build();

        Book book1 = new Book.Builder("20-21","AnotherBook").description("This is a description")
                                                                      .author("Myself").build();

        Book book2 = new Book(new Book.Builder("df","ddf"));

        System.out.println(book);
        System.out.println(book1);
        System.out.println(book2);

    }
}
