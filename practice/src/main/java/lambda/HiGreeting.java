package lambda;

public class HiGreeting implements Greeting{
    @Override
    public void perform() {
        System.out.println("Greeting Hi.....");
    }
}
