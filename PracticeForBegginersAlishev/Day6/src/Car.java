public class Car {
    int releaseDate;
    String color;
    String model;

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void info() {
        System.out.println("Это автомобиль");;
    }

    // можно проще return year - releaseDate
    public int yearDifference(int year) {
        int difference =  Math.abs(year - releaseDate);
        return difference;
    }

}
