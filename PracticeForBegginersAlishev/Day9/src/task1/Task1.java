package task1;

public class Task1 {
    public static void main(String[] args) {
        Student student1 = new Student("Sergey", "КГБ-952(аб)");
        Teacher teacher1 = new Teacher("Conor", "UFC");

        System.out.println(student1.getNameOfGroup());
        System.out.println(teacher1.getNameOfDiscipline());

        student1.printInfo();
        teacher1.printInfo();
    }
}