package tema;

public class speed {
    public static void main(String[] args) {
        speed1();
    }
        public static void speed1() {
            double distance = 4500;
            int hours = 2;
            int minutes = 13;
            int seconds = 53;
            int a = 60;
            int b = 3600;
            int totalseconds = seconds + minutes * a + hours * b;
            int totalhours = hours + minutes / a + seconds / b;
            double km = distance / 1000;
            double speed1 = (distance / totalseconds);
            double speed2 = (km / totalhours);
            double speed3 = (km / totalhours)/1.609;
            System.out.println("Meters per second: " + speed1 + " m/s");
            System.out.println("Kilometers per hour: " + speed2 + " km/h");
            System.out.println("Miles per hour: "+speed3+" mph");
    }
}
