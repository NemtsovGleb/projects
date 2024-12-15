public class Test {
    public static void main(String[] args) {
        User gleb = new User("Gleb");
        User sergey = new User("Sergey");
        User ilya = new User("Ilya");

        gleb.sendMessage(sergey, "Hello friend!");
        gleb.sendMessage(sergey, "How are you?");

        sergey.sendMessage(gleb, "Hello bro");
        sergey.sendMessage(gleb, "I'm fine, thanks");
        sergey.sendMessage(gleb, "Go discord!");

        ilya.sendMessage(gleb, "Hello Gleb");
        ilya.sendMessage(gleb, "You are the best java developer ever");
        ilya.sendMessage(gleb, "Please, join in our company!");

        gleb.sendMessage(ilya, "Hello Ilya");
        gleb.sendMessage(ilya, "Thanks for offer");
        gleb.sendMessage(ilya, "But now i work in Microsoft");

        ilya.sendMessage(gleb, "Okay, good luck, we love you");

        MessageDatabase.showDialog(sergey, gleb);

    }
}