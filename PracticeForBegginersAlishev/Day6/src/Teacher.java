import java.util.Random;

public class Teacher {
    private String name;
    private String discipline;

    public Teacher(String name, String discipline) {
        this.name = name;
        this.discipline = discipline;
    }

    public void evaluate(Student student) {
        String mark = "";
        Random rand = new Random();
        int randMark = rand.nextInt(4) +2;
       switch(randMark) {
           case 2:
               mark = "Неудовлетворительно";
               break;
           case 3:
               mark = "Удовлетворительно";
               break;
           case 4:
               mark = "Хорошо";
               break;
           case 5:
               mark = "Отлично";
               break;
       }

        System.out.println("Преподаватель: " + this.name + " оценил студента с именем "
        + student.getName() + " по предмету " + this.discipline + " на оценку " + mark);
    }
}
