package singleton.naiveSingleton.multithreaded.solutions.usingEagerInitialization;

public class Thread_2 implements Runnable{
    @Override
    public void run() {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
    }
}
