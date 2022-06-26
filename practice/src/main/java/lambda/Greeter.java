package lambda;

public class Greeter {

    public static void main(String[] args) {

        Greeter greeter = new Greeter();
        Greeting greeting = new HelloGreeting();
        greeter.greet(greeting);

        HiGreeting hiGreeting = new HiGreeting();
        greeter.greet(hiGreeting);

        greeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Greeting From Anonymous");
            }
        };

        greeter.greet(greeting);

        greeting = () -> {
            System.out.println("Greeting from Lambda");
        };

        greeter.greet(greeting);

        greeter.greet(()-> System.out.println("Greeting from Lambda"));


    }

    public void greet(Greeting greeting) {
        greeting.perform();
    }
}