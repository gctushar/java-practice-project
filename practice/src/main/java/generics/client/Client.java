package generics.client;

import generics.generics.CompareExample;

public class Client {
    public static void main(String[] args) {

        try {
            System.out.println("\nExample with self define Compare: ");
            System.out.println(CompareExample.compare("ab","ab"));
            System.out.println(CompareExample.compare("ab","abc"));
            System.out.println(CompareExample.compare(1.2,1.2));
            System.out.println(CompareExample.compare(1,1));
        }catch (NullPointerException e){
            System.out.println("Exception In compare");
        }


        try {
            System.out.println("\nExample with Compareable: ");
            System.out.println(CompareExample.compareWithComparable("ab","ab"));
            System.out.println(CompareExample.compareWithComparable("ab","abc"));
            System.out.println(CompareExample.compareWithComparable(1.2,1.2));
            System.out.println(CompareExample.compareWithComparable(1,1));
        }catch (NullPointerException e){
            System.out.println("Exception In compare");
        }
    }
}
