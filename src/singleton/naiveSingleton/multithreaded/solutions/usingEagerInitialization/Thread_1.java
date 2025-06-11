package singleton.naiveSingleton.multithreaded.solutions.usingEagerInitialization;

public class Thread_1 implements Runnable{

    @Override
    public void run() {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
    }
}
