import java.util.Random;

public class Main {
    public static void main(String[] args) {

//        for(int i = 0; i<100; i++) {
//            System.out.println(Math.round(Math.random()*10));
//        }

        Random random = new Random();
        for(int i = 0; i<100; i++) {
            System.out.println(random.nextInt(6) + 1);
        }

    }
}

// nextInt - мы указываем число до которого будут выведены числа
// если нужны числа не с нуля, а от еденицы и до указанного
//  в диапазоне числа, мы просто прибавляем +1
//

// round - округлит число если больше либо равно пяти то в большую сторону
// если меньше то в меньшую
// floor - округляет в меньшую сторону если 11.8 то получим 10

// ceil - округляет в большую сторону без разницы если 11.2 до получи 12