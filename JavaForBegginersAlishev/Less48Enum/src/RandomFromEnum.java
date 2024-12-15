import java.util.Random;

public class RandomFromEnum {
    public static void main(String[] args) {

        Random random = new Random();
        Season season;
        season = getRandomEnum(Season.class, random);
        System.out.println(season);
        }
        
        public static <E extends Enum<E>> E getRandomEnum(Class<E> clazz, Random r) {
            E[] constants = clazz.getEnumConstants();
            return constants[r.nextInt(constants.length)];
    }
}

