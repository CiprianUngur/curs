package tema;

public class temperature {
    String fahrenheit;
    public static void main(String[] args) {
        double fahrenheit = 12;
        double x = 5;
        double y = 9;
        int z = 32;
        double celsius = x/y * (fahrenheit - z);
        System.out.println("Temperature in Celsius is "+celsius);
    }
}
