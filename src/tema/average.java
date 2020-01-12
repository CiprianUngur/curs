package tema;

public class average {
    public static void main(String[] args) {
        double x = avg(21, 56, 44);
        System.out.println(x);
    }
    public static double avg(double first, double second, double third){
        double avg = (first + second + third) / 3;
        return avg;
    }
}
