package tema;

public class inch {
    public static void main(String[] args) {
        inches();
    }

    public static void inches(){
        int inch = 27;
        double y = 0.0254;
        double meters = inch * y;
        System.out.println(inch+" inches are "+meters+" meters");

    }
}
