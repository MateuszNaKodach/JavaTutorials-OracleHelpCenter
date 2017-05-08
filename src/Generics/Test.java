package Generics;

import java.util.ArrayList;

/**
 * Created by Mateusz on 19.12.2016.
 */
public class Test {
    public static void main(String[] args) {

        Box box1 = new Box();
        box1.set("23");
        //Integer liczba;
        //liczba = box1.get();
        //String string = box1.get();

        //BoxGeneric<ArrayList<Integer>> box1 = new BoxGeneric<>();
        //Integer liczba = box1.get().get(0);

        BoxGeneric box2 = new BoxGeneric();
        box2.set("HelloWorld");
        System.out.println(box2.get());
        box2.set(22);
        System.out.println(box2.get());

        ArrayList<Object> lista = new ArrayList<>();
        lista.add(22);
        lista.add("Lalala");
        for(Object x: lista)
            System.out.println(x.toString());

        @SuppressWarnings("a")
        BoxGeneric<Integer> box4 = new BoxGeneric();

        //https://docs.oracle.com/javase/tutorial/java/generics/inheritance.html
    }
}
