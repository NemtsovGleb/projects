import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Test {
    private int counter;

    public static void main(String[] args) throws InterruptedException {
        Test test = new Test();
        test.doWork();
    }


    public void increment() {
        //synchronized (this) {
            counter++;
       // }
    }

    public void doWork() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10000; i++)
                    increment();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10000; i++)
                    increment();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter);

        ExecutorService service = Executors.newFixedThreadPool(2);
    }
}



