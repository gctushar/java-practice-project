package designpattern.singleton;

public class DoubleChecking {

    private static volatile DoubleChecking instance = null;

    private DoubleChecking() {

        instance = new DoubleChecking();
    }

    public DoubleChecking getInstance() {

        if (null == instance) {
            synchronized (DoubleChecking.class) {
                if (null == instance) {
                    instance = new DoubleChecking();
                }
            }
        }
        return instance;
    }
}