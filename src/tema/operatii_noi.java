package tema;

public class operatii {
    public static void main(String[] args) {

        System.out.println("Rezultatul adunarii este: " + adunare(34,25));
        System.out.println("Rezultatul scaderii este: "+ scadere(18, 7));
        System.out.println("Rezultatul impartirii este: "+ impartire(72, 3));
        System.out.println("Rezultatul inmultirii este: "+ inmultire(11, 5));

    }

    public static int adunare(int first, int second){

        int rezultat = first + second;

        return rezultat;

    }
    public static int scadere(int first, int second){
        int rezultat = first - second;
        return rezultat;
}
    public static int impartire(int first, int second){
        int rezultat = first / second;
        return rezultat;
    }
    public static int inmultire(int first, int second){
        int rezultat = first * second;
        return rezultat;
    }
}
