public class Airplane {
    private String producer;
    private int yearRelease;
    private int length;
    private float weight;
    private float fuel = 0;

    public Airplane(String producer, int yearRelease, int length, float weight) {
        this.producer = producer;
        this.yearRelease = yearRelease;
        this.length = length;
        this.weight = weight;
    }

    public void fillUp(int x) {
        fuel += x;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void info() {
        System.out.println("Изготавитель: " + producer + " год выпуска: "
        + yearRelease + " длина: " + length + " вес: " + weight +
                " количество топлива в баке: " + fuel);
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if(airplane1.getLength() > airplane2.getLength() ) {
            System.out.println("Первый самолет длиннее ");
        } else if(airplane1.getLength() < airplane2.getLength() ) {
            System.out.println("Второй самолет длиннее ");
        } else {
            System.out.println("У самолетов одинаковая длинна");
        }
    }
}
