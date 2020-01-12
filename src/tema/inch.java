package tema;

public class inch {
    public static void main(String[] args) {
        System.out.println("The result of the conversion from inches to meters is: " +convert(44)+ " meters");
    }

    public static double convert(double inch){
        double y = 0.0254;
        double convert = inch * y;
        return convert;
    }
}
