public class AnimalException extends Exception {

    public AnimalException() {
    }

    public AnimalException(String message) {
        super(message);
    }

    public AnimalException(String message, Throwable cause) {
        super(message, cause);
    }

    public void live() throws AnimalException {
        throw new AnimalException("Throw in Animals.java");
    }
}
