package singleton.naiveSingleton.multithreaded.solutions.usingVolatile;

public class Thread_1 implements Runnable{

    @Override
    public void run() {
        Singleton singleton = Singleton.getInstance("Rahil");
        System.out.println(singleton.value);
        System.out.println(singleton);
    }
}
