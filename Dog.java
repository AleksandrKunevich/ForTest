public class Dog extends AnimalException {
    public Dog() {
    }

    public Dog(String message) {
        super(message);
    }

    public Dog(String message, Throwable cause) {
        super(message, cause);
    }

    public void gau() throws PudelException {
        try {
            super.live();
        } catch (AnimalException e) {
            throw new PudelException("Throw in Dog.java", e);
        }
    }
}
