
public class PruebaUnaClase {

    public static void main(String[] args) {
        try {
            new UnaClase(-1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
