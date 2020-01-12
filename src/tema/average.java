package tema;

public class average {
    public static void main(String[] args) {
        System.out.println("The result of the average is: " + avg(21, 56, 44));
    }
    public static double avg(double first, double second, double third){
        double avg = (first + second + third) / 3;
        return avg;
    }
}
