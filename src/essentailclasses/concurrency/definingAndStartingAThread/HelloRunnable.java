package essentailclasses.concurrency.definingAndStartingAThread;

/**
 * Created by Mateusz on 09.05.2017.
 */
public class HelloRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello Runnable!");
    }

    public static void main(String[] args) {
        new Thread(new HelloRunnable()).start();
    }
}
