package singleton.naiveSingleton.multithreaded.problem.general;


public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }
}
