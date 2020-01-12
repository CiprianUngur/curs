package tema;

public class modal {
    public static void main(String[] args) {
        System.out.println("The remainder of dividing the two numbers is: "+ modulus(343, 256));
    }
    public static int modulus(int first, int second){
        int remainder = (first%second);
        return remainder;
    }

}
