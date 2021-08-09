public class Pudel extends Dog {

    public Pudel(String message) {
        super(message);
    }

    public Pudel(String message, Throwable cause) {
        super(message, cause);
    }

    public void tiau() throws PudelException {
        try {
            super.gau();
        } catch (PudelException e) {
            throw new PudelException("Throwww in Pudel", e);
        }
    }
}