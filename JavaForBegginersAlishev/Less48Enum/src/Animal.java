public enum Animal {
    CAT("кошка"), DOG("собака"), FROG("лягушка");
    // new DOG("собака")

    private String translation;

    Animal() {}


     Animal(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    public String toString() {
        return "Перевод на русский язык: " + translation;
    }
}
