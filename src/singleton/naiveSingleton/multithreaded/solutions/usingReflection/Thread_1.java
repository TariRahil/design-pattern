package singleton.naiveSingleton.multithreaded.solutions.usingReflection;

public class Thread_1 implements Runnable{

    @Override
    public void run() {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
    }
}
