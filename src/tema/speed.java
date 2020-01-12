package tema;

public class speeds {
    public static void main(String[] args) {
        System.out.println("Meters per second: " + speed1(3457, 1, 15,34) + " m/s");
        System.out.println("Kilometers per hour: " + speed2( 8940, 1, 15,34) + " km/h");
        System.out.println("Miles per hour: "+speed3(1650, 1,15,34) +" mph");
    }

    public static double speed1(int meters, double hours, double minutes, double seconds){
        double result1 = meters / (hours*3600 + minutes*60 + seconds);
        return result1;
    }

    public static double speed2(int meters, double hours, double minutes, double seconds){
        double result2 = (meters / 1000f) / (hours + minutes/60 + seconds/3600);
        return result2;
    }

    public static double speed3(int meters, double hours, double minutes, double seconds){
        double result2 = (meters / 1000f) / (hours + minutes/60 + seconds/3600);
        double result3 = result2/1.609;
        return result3;
    }
}
