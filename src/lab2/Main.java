package lab2;

public class Main {
    public static void main(String[] args) {
            int x = subtract(1000, 350);
            System.out.println(x);
            int y = add(333, 666);
            System.out.println(y);
            double z = divide(2200, 444);
            System.out.println(z);
            int w = multiply(36, 56);
            System.out.println(w);
    }
    public static int subtract(int first, int second){
        int subtract = first - second;
        return subtract;
    }
    public static int add(int first, int second){
        int add = first + second;
        return add ;
    }
    public static double divide(int first, int second){
        double divide = 1.0 * first / second;
        return divide;
    }
    public static int multiply(int first, int second){
        int multiply = first * second;
        return multiply;
    }
}


