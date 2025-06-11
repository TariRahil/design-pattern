package singleton.naiveSingleton.singleThreaded;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("Rahil");
        System.out.println(singleton.value);
        System.out.println(singleton);

        Singleton singleton1 = Singleton.getInstance("Tari");
        System.out.println(singleton1.value);
        System.out.println(singleton1);
    }
}