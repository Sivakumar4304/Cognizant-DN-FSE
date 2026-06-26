//singleton pattern- one class has only one instance and provides a global point of access to it.
class logger {

    private static logger obj = new logger();

    private logger() {
        System.out.println("Logger is created");
    }

    public static logger getInstance() {
        return obj;
    }
}

public class SingletonPatternExample {
    public static void main(String[] args) {

        logger l1 = logger.getInstance();
        logger l2 = logger.getInstance();
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l1 == l2);
    }

}
