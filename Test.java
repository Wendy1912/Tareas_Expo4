
public class Test {

    public static void main(String[] args) {
        try {
            throw new ExepcionB("Exepcion B");
        } catch (ExepcionA e) {
            e.printStackTrace();
        }

        try {
            throw new ExepcionC("Exepcion C");
        } catch (ExepcionA e) {
            e.printStackTrace();
        }
    }

}
