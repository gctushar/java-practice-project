package lambda;

interface Process {
    void process(int i);
}

public class ClosersExample {


    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        doProcess(a, x -> System.out.println(x + b));
//         b =5;
    }

    public static void doProcess(int a, Process process) {
        process.process(a);
    }

}

