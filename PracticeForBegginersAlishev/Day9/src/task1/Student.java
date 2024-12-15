package task1;

public class Student extends Human {
    private String nameOfGroup;

    public Student(String name, String nameOfGroup) {
        super(name);
        this.nameOfGroup = nameOfGroup;
    }

    public String getNameOfGroup() {
        return nameOfGroup;
    }

    public void setNameOfGroup(String nameOfGroup) {
        this.nameOfGroup = nameOfGroup;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем " + name);
    }
}
