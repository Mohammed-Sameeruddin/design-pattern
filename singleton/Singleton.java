package designPattern.singleton;

public class Singleton {
    private Singleton() {
    }

    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            return instance = new Singleton();
        } else {
            return instance;
        }
    }
}
