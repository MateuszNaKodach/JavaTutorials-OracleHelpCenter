package Generics;

/**
 * Created by Mateusz on 07.01.2017.
 */
public class Test2 {

    class MyClass<X> {
        <T> MyClass(T t) {
        }
    }

    static <T> T pick(T a1, T a2){return a2;}

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println(pick(5,10));


    }
}
