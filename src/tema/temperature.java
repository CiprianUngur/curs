package tema;

public class temperature {

    public static void main(String[] args) {
        System.out.println("Converting Fahrenheit to Celsius gives " +conversion(13)+ " degrees");
    }

    public static double conversion(double fahrenheit){
    double conversion = 5 / 9f * (fahrenheit - 32);
    return conversion;
}
}
