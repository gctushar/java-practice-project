package interfaceexample;

public interface Car {

    void run();

    default void honk(String sound){
        System.out.println(sound + " from Car");
    }
    static void honk(){
        System.out.println("Static honk");
    }
}
