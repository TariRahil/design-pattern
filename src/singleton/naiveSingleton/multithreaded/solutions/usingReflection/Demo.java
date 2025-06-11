package singleton.naiveSingleton.multithreaded.solutions.usingReflection;

public class Demo {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Thread_1());
        Thread thread2 = new Thread(new Thread_2());
        thread1.start();
        thread2.start();
    }
}
