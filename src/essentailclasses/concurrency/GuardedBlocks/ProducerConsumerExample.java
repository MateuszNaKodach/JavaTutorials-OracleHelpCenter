package essentailclasses.concurrency.GuardedBlocks;

/**
 * Created by Mateusz on 09.05.2017.
 */
public class ProducerConsumerExample {

    public static void main(String[] args) throws InterruptedException {
        Drop drop = new Drop();
        Thread t1 =  new Thread(new Producer(drop));
        Thread t2 = new Thread(new Consumer(drop));

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }

    //https://docs.oracle.com/javase/tutorial/essential/concurrency/immutable.html
}
