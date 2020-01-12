package lab2;

public class average {
    public static void main(String[] args) {
        double x = average(21, 56, 44);
        System.out.println(x);
    }
    public static double average(double first, double second, double third){
        double average = (first + second + third) / 3;
        return average;
    }
}
