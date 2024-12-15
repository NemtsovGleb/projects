package JavaCore.Streams.InputStreamOutputStream;

import java.io.*;

public class ObjectInputOutputStream {
    public static void main(String[] args) {

        Person person = new Person("John", 30);
        String path = "D:\\IDEAprojects\\PULSEofMACHINE\\resources\\person.ser";
        // Сериализация объекта в файл
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            oos.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Десериализация объекта из файла
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            Person deserializedPerson = (Person) ois.readObject();
            System.out.println("Deserialized Person: " + deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}