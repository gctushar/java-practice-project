package genericspractice.generics;

public class CompareExample {

    public static <T>  boolean compare(T ob1,T ob2){

        System.out.print (ob1.toString() + " == " + ob2.toString() + " : ");
        if (ob1.getClass().equals(String.class)){
            String s = (String) ob1;
            String ss = (String) ob2;
            return s.equals(ss);
        }else if(ob1.getClass().equals(Double.class)){
            Double a = (Double) ob1;
            Double b = (Double) ob2;
            return a == b;
        }else {
            System.out.println("Not Supported");
            throw new NullPointerException();
        }

    }

    public static <T extends Comparable> boolean compareWithComparable(T ob1,T ob2){
        System.out.print (ob1.toString() + " == " + ob2.toString() + " : ");
        return ob1.equals(ob2);
    }
}
