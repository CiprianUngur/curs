package tema;

public class modal {
    public static void main(String[] args) {
        int x = modal(343, 256);
        System.out.println(x);
    }
    public static int modal(int first, int second){
        int modal = (first%second);
        return modal;
    }

}
