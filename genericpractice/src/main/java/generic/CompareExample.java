package generic;

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

    public static void main(String[] args) {

        try {
            System.out.println("\nExample with self define Compare: ");
            System.out.println(compareWithComparable("ab","ab"));
            System.out.println(compareWithComparable("ab","abc"));
            System.out.println(compareWithComparable(1.2,1.2));
            System.out.println(compareWithComparable(1,1));
        }catch (NullPointerException e){
            System.out.println("Exception In compare");
        }


        try {
            System.out.println("\nExample with Compareable: ");
            System.out.println(compare("ab","ab"));
            System.out.println(compare("ab","abc"));
            System.out.println(compare(1.2,1.2));
            System.out.println(compare(1,1));
        }catch (NullPointerException e){
            System.out.println("Exception In compare");
        }
    }
}
