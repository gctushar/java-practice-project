package interfaceexample;

public class Audi implements Car{

    @Override
    public void run() {
        System.out.println("Audi is running");
    }

    @Override
    public void honk(String honk) {
        System.out.println(honk + "Honk from Audi Class");
    }

}
