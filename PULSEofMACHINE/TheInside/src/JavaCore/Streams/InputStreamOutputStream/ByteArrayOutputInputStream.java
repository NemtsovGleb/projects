package JavaCore.Streams.InputStreamOutputStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputInputStream {
    public static void main(String[] args) {

        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            String data = "Hello, ByteArrayOutputStream!";
            baos.write(data.getBytes());  // Записываем данные в поток

            byte[] byteArray = baos.toByteArray();  // Получаем данные в виде массива байтов

            System.out.println("Записанные данные: " + new String(byteArray));  // Преобразуем обратно в строку
        } catch (IOException e) {
            e.printStackTrace();
        }


        byte[] byteArray = "Hello, ByteArrayInputStream!".getBytes();
        try (ByteArrayInputStream bais = new ByteArrayInputStream(byteArray)) {
            int data;
            while ((data = bais.read()) != -1) {
                System.out.print((char) data);  // Читаем и выводим данные по байту
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
