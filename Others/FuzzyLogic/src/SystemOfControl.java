public class SystemOfControl {

    public static void warmUpTime(String weather, String carCondition) {
        switch(weather) {
            case "very cold":
                if(carCondition == "old") {
                    System.out.println("Warm-up time: 20 minutes");
                } else {
                    System.out.println("Warm-up time: 15 minutes");
                }
                break;
            case "cold":
                if(carCondition == "old") {
                    System.out.println("Warm-up time: 15 minutes");
                } else {
                    System.out.println("Warm-up time: 10 minutes");
                }
                break;
            case "warm":
            case "very warm":
                System.out.println("Warm-up don't need");
                break;
        }
    }
}
