public class Main {
    public static void main(String[] args) {
        Human h1 = new Human("Bob",40);
        Human h2 = new Human("Tom", 30);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();


    }
}

class Human {
    private String name;
    private int age;
    private static int countPeople;


    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printNumberOfPeople() {
        System.out.println("Number of people is " + countPeople);
    }

}