public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player(1);
        Player player2 = new Player(90);
        Player player3 = new Player(2);
        Player player4 = new Player(3);
        Player player5 = new Player(4);
        Player player6 = new Player(5);
        Player player7 = new Player(6);
        Player player8 = new Player(7);

        System.out.println(Player.countPlayers);

        Player.info();

        System.out.println(player1.getStamina());
        System.out.println(player2.getStamina());
        System.out.println(player3.getStamina());
        System.out.println(player4.getStamina());
        System.out.println(player5.getStamina());
        System.out.println(player6.getStamina());

        while(player1.getStamina() !=0) {
            player1.run();
        }

        player1.run();
        System.out.println(player1.getStamina());
//        Player.info();
    }
}
