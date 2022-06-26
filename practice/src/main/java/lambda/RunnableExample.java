package lambda;

public class RunnableExample {

    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printed Inside Anonymous Runnable");
            }
        });

        Thread thread1 = new Thread(()-> System.out.println("Printing from Lambda Runnable"));

        thread.start();
        thread1.start();

    }
}
