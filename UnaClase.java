
public class UnaClase {

    private int n;

    public UnaClase(int n) throws Exception {
        if (n < 0) {
            throw new Exception("El número debe ser mayor a 0");
        }

        this.n = n;
    }
}
