public class TestOne {

    public static void main(String[] args) {
        Pudel pudel = new Pudel("Tiauuuuu in Main");
        try {
            pudel.tiau();
        } catch (PudelException e) {
            System.out.println("Catch finishid in Main");
            System.out.println(e.getMessage());
            e.printStackTrace();

            StackTraceElement[] stack = e.getStackTrace();
            for (StackTraceElement i : stack) {
                System.out.println(i);
            }
        } finally {
            System.out.println("Print finally erever!");
        }
    }
}
