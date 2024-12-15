package alternative.method;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("people2.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person[] people2 = (Person[]) ois.readObject();

            System.out.println(Arrays.toString(people2));

            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
