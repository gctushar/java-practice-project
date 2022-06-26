package lambda;

public class ThisReferenceExample {

    public static void main(String[] args) {

        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();

        Process process = new Process() {
            @Override
            public void process(int i) {
                System.out.println("Value of i is :" + i);
                System.out.println(this);
            }
        };

        thisReferenceExample.doProcess(10, process);
        thisReferenceExample.doProcess(5, i -> {
            System.out.println("Value of i is :" + i);
//            System.out.println(this); //Will not work
        });

        thisReferenceExample.execute();
    }

    public void doProcess(int i, Process p) {
        p.process(i);
    }

    public void execute() {
        System.out.println(this);
        doProcess(50, i -> {
            System.out.println("Value of i is :" + i);
            System.out.println(this);
        });
    }
}
