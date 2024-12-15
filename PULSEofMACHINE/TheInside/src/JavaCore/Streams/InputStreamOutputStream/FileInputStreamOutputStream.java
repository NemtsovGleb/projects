package JavaCore.Streams.InputStreamOutputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamOutputStream {
    public static void main(String[] args) throws IOException {

        // запись в файл
        String []str1 = {"Hello Alien", "How are you"};
        FileOutputStream fos = new FileOutputStream("D:\\IDEAprojects\\PULSEofMACHINE\\resources\\Message.txt");

        for(String str: str1) {
            fos.write(str.getBytes());
            // \n - это перенос строки
            fos.write("\n".getBytes());
        }

        //fos.close();

        // чтение из файла
        FileInputStream fis = new FileInputStream("D:\\IDEAprojects\\PULSEofMACHINE\\resources\\Message.txt");
        StringBuffer str2 = new StringBuffer();

        int counterBytes = fis.available();
        System.out.println(counterBytes);
        // мы читаем байт переводим его из int в char
        char temp = (char) fis.read();

        counterBytes = fis.available();
        System.out.println(counterBytes);

        str2.append(temp);
        System.out.println(str2);
        //fis.close();


        FileInputStream fis2 = new FileInputStream("D:\\IDEAprojects\\PULSEofMACHINE\\resources\\Message.txt");
        // Читаем весь файл
        StringBuffer str3 = new StringBuffer();
        while(fis2.available() > 0) {   // available возвращает число непрочитанных байт
            temp = (char) fis2.read();
            str3.append(temp);
        }
        System.out.println(str3);

        // Мы все прочитали и возвращает 0
        counterBytes = fis2.available();
        System.out.println(counterBytes);
        //fis2.close();

        FileInputStream fis3 = new FileInputStream("D:\\IDEAprojects\\PULSEofMACHINE\\resources\\Message.txt");
        int character;
        StringBuffer str4 = new StringBuffer();
        while((character = fis3.read()) != -1) {

            str4.append((char) character);
        }
        System.out.println(str4);


    }





}
