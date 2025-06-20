public class MainApp {
    public static void main(String[] args) {
        MyLogger logger1 = MyLogger.getInstance();
        MyLogger logger2 = MyLogger.getInstance();

        logger1.log("First log message");
        logger2.log("Second log message");

        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 refer to the same instance.");
        } else {
            System.out.println("Different instances exist.");
        }
    }
}

class MyLogger {
    private static MyLogger instance;

    private MyLogger() {
        System.out.println("MyLogger Initialized");
    }

    public static MyLogger getInstance() {
        if (instance == null) {
            instance = new MyLogger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
