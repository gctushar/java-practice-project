package lambda;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class TypeInterfaceExample {

    public static void main(String[] args) {

        StringLengthInterface stringLengthLambda = (String s) -> s.length();

        System.out.println(stringLengthLambda.getLength("1234"));

        StringLengthInterface myLambda = (s) -> s.length() * 10;

        System.out.println(myLambda.getLength("55555"));

        StringLengthInterface simplestLambda = s -> s.length();

        System.out.println(simplestLambda.getLength("666666"));


    }

    interface StringLengthInterface {
        int getLength(String s);
    }
}
