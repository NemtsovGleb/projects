import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) throws IOException {

        Person[] people = {new Person(1, "Bob"),
                new Person(2, "Mike"), new Person(3, "Gleb")};

        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeInt(people.length);
            for(Person person : people) {
                oos.writeObject(person);
            }

            oos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}