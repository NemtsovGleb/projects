import java.util.Random;

public class Player {
    private int stamina;

    private static final int  MAX_STAMINA = 100;
    private static final int  MIN_STAMINA = 0;
    static int countPlayers;

    public int getStamina() {
        return stamina;
    }

    public Player(int stamina) {
        this.stamina = stamina;
        if(countPlayers < 6)
            countPlayers++;
    }

    public void run() {
        if(stamina == 0)
            return;

        stamina--;

        if(stamina == 0){
            countPlayers--;
            System.out.println("Игрок уходит с поля, он устал.");
        }
    }

    public static void info() {
        if(countPlayers == 6) {
            System.out.println("На поле нет свободных мест");
        } else {
            System.out.println("Команды не полные. На поле еще есть " + (6 - countPlayers)
                    + " свободных мест");
        }
    }


}
