public class Motorbike {
   private int dateRelease;
   private String color;
   private String model;

   public Motorbike() {}

    public Motorbike(int dateRelease, String color, String model) {
        this.dateRelease = dateRelease;
        this.color = color;
        this.model = model;
    }

    public int getDateRelease() {
        return dateRelease;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int year) {
       int difference = Math.abs(year - dateRelease);
       return difference;
    }
}
