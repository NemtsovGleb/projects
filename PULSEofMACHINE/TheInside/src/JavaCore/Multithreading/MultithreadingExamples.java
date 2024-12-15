package JavaCore.Multithreading;

public class MultithreadingExamples {
    public static void main(String[] args) throws InterruptedException {


         Thread th1 = new Thread(() -> {
             try {
                 Thread.sleep(5000);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
             System.out.println("Hello World");
        });

         th1.start();
         th1.join();

        System.out.println("Главный поток завершен");
    }
}
