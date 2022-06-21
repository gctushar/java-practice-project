package linklistimplementation;

public class App {


    public static void main(String[] args) {
        Linklist<Integer> linklist = new Linklist<>();

        linklist.add(1);
        linklist.add(2);
        linklist.add(3);
        linklist.add(5);
        linklist.add(5);
        linklist.add(7);
        linklist.printAll();
        System.out.println("Size: " + linklist.getSize());
        linklist.deleteFirstData(5);
        linklist.deleteFirstData(5);
        linklist.deleteFirstData(1);
        linklist.deleteFirstData(7);
        linklist.add(5);
        linklist.printAll();
        System.out.println("Size: " + linklist.getSize());
        
        Linklist<Integer> linklist2 = new Linklist<>();

        linklist2.add(5);
        linklist2.add(6);
        linklist2.add(7);
        linklist2.add(1);
        linklist2.add(6);
        linklist2.add(9);

        linklist2.printAll();
    }
}
