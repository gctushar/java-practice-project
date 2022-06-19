package interfaceexample;

public class App {

    public static void main(String[] args) {
        Car audi = new Audi();
        Honda honda = new Honda();

        honda.run();
        honda.honk("pipi");
//        honda.honk();

        audi.run();
        audi.honk("piiiiiiii");

        Car.honk();
    }
}
