package singleton.naiveSingleton.multithreaded.solutions.usingVolatile;

public class Thread_2 implements Runnable{
    @Override
    public void run() {
        Singleton singleton = Singleton.getInstance("Tari");
        System.out.println(singleton.value);
        System.out.println(singleton);
    }
}
