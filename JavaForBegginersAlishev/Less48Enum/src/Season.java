public enum Season {
    SUMMER(35), WINTER(-30), AUTUMN(15), SPRING(20);

    private int temperature;

    Season(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
