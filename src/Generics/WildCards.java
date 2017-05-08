package Generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mateusz on 09.01.2017.
 */
class A {
    void functionA1(){
        System.out.println("functionA1");
    };
    void functionA2(){
        System.out.println("functionA2");
    };
}
class B extends A {
    void functionB1(){
        System.out.println("functionB1");
    };
}
class C extends B {
    void functionC1(){
        System.out.println("functionC1");
    };
}
class D extends C {
    void functionD1(){
        System.out.println("functionD1");
    };
}
class E extends D {
    void functionE1(){
        System.out.println("functionE1");
    };
}
class F extends E {
    void functionF1(){
        System.out.println("functionF1");
    };
}

public class WildCards {


    static void printList(List<? extends C> list){
        for(C x: list){
            System.out.println(x);
            x.functionC1();
        }
    }

    static void printListLower(List<? super C> list){
        printListLowerHelper(list);
    }

    private static <T> void printListLowerHelper(List<T> list){
        for(T x: list){
            System.out.println(x);
        }
    }

    public static void addNumbers(List<? super Integer> list) {
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
    }

    public static void main(String[] args) {
        List<? extends Integer> intList = new ArrayList<>();
        List<? extends Number>  numList = new ArrayList<>();
        numList = intList;

        A classA = new B();
        classA.functionA1();
        B classB = new B();
        classB.functionA1();
        classB.functionB1();

        //upper bounded WildCards
        //printList(new ArrayList<B>());
        printList(new ArrayList<C>());
        printList(new ArrayList<D>());
    }
}
