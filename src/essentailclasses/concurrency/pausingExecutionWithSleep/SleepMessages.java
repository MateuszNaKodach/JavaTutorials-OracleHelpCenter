package essentailclasses.concurrency.pausingExecutionWithSleep;

/**
 * Created by Mateusz on 11.01.2017.
 */
public class SleepMessages {
    public static void main(String[] args) throws InterruptedException {
        String importantInfo[] = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
        };

        for(int i=0;i<importantInfo.length;i++){
            //Pause for 4 second
            Thread.sleep(4000);
            System.out.println(importantInfo[i]);
        }
    }
}
