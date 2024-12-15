import java.util.Random;

public class TwoDigitNumbersTrainerSubtraction {
    public static void main(String[] args) {

        Random rand = new Random();
        for(int i =0; i < 10; i++){
            int firstNumber = rand.nextInt(89) + 11;
            int secondNumber = rand.nextInt(89) + 10;
            int result = firstNumber - secondNumber;

            System.out.println(firstNumber + " - " + secondNumber + "                = " + result);

        }
    }
}
