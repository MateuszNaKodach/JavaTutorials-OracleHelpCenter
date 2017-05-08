package Generics;

/**
 * Created by Mateusz on 19.12.2016.
 */
public class BoxGeneric<T> {
    private T object;

    public void set(T object) { this.object = object; }
    public T get() { return object; }
}
