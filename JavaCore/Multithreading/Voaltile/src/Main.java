import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
//        myThread.start();
//
//        Scanner scanner = new Scanner(System.in);
//        scanner.nextLine();
//
//        myThread.shutdown();

        String a = "string a";
        String b = new String("string a");
        String c = b.intern();


        String str = "Hello";
        str += "bye";
        System.out.println(str);

        System.out.println(a == b); //false
        System.out.println(b == c); //false
        System.out.println(a == c); //true
        System.out.println(a == b);
        System.out.println(b ==c );
    }
}

class MyThread extends Thread {
    private volatile boolean running = true;

    public void run() {
        while(running) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void shutdown() {
        this.running = false;
    }
}