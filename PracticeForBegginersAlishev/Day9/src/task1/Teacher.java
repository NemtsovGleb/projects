package task1;

public class Teacher extends Human {
    private String nameOfDiscipline;

    public Teacher(String name, String nameOfDiscipline) {
        super(name);
        this.nameOfDiscipline = nameOfDiscipline;
    }

    public String getNameOfDiscipline() {
        return nameOfDiscipline;
    }

    public void setNameOfDiscipline(String nameOfDiscipline) {
        this.nameOfDiscipline = nameOfDiscipline;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + name);
    }
}
