package essentailclasses.concurrency.synchronization.synchronizedMethods;

import java.util.stream.IntStream;

/**
 * Created by Mateusz on 09.05.2017.
 */
public class SynchronizedCounter {

    private int c=0;

    public synchronized void increment(){
        c++;
    }

    public synchronized void decrement(){
        c--;
    }

    public synchronized int value(){
        return c;
    }

    public static void main(String[] args) {
        SynchronizedCounter counter = new SynchronizedCounter();

        Thread increment100 = new Thread(() -> {
            IntStream.rangeClosed(1,100).forEach(i -> counter.increment());
        });

        Thread decrement50 = new Thread(() -> {
            IntStream.rangeClosed(1,50).forEach(i -> counter.decrement());
        });

        increment100.start();
        decrement50.start();
        try {
            increment100.join();
            decrement50.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter.value());
    }
}
