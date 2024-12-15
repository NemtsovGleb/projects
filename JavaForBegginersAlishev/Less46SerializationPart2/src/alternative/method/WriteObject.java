package alternative.method;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) throws IOException {

        Person[] people2 = {new Person(1, "Bob"),
                new Person(2, "Mike"), new Person(3, "Gleb")};

        try {
            FileOutputStream fos = new FileOutputStream("people2.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(people2);

            oos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}