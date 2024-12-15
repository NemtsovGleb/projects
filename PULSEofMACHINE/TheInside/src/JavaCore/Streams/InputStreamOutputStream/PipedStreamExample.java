package JavaCore.Streams.InputStreamOutputStream;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreamExample {
    public static void main(String[] args) {

        try {
            // Создаем PipedInputStream и PipedOutputStream
            PipedOutputStream out = new PipedOutputStream();
            PipedInputStream in = new PipedInputStream(out);

            // Поток, который пишет данные
            Thread writerThread = new Thread(() -> {
                try {
                    String message = "Hello, this is a message from writer!";
                    out.write(message.getBytes());
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            // Поток, который читает данные
            Thread readerThread = new Thread(() -> {
                try {
                    int data;
                    while ((data = in.read()) != -1) {
                        System.out.print((char) data);
                    }
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            // Запуск потоков
            writerThread.start();
            readerThread.start();

            // Ожидаем завершения работы потоков
            writerThread.join();
            readerThread.join();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}

