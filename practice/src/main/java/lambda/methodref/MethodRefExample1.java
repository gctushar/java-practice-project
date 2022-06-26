package lambda.methodref;

public class MethodRefExample1 {

    public static void main(String[] args) {

        printMessage();

        Thread thread = new Thread(()->printMessage());

        Thread thread1 = new Thread(MethodRefExample1:: printMessage);

        thread.start();
        thread1.start();
    }

    public static void printMessage(){
        System.out.println(Thread.currentThread().getName() + " Printing Hello");
    }
}
