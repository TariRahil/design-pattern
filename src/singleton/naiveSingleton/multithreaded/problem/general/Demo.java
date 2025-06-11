package singleton.naiveSingleton.multithreaded.problem.general;

import  java.lang.reflect.Constructor;
public class Demo {
    public static void main(String[] args) throws Exception {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton.hashCode());
        System.out.println(singleton2.hashCode());

        Class clazz = Class.forName("singleton.naiveSingleton.multithreaded.problem.general.Singleton");
        Constructor<Singleton> ctr = clazz.getDeclaredConstructor();
        ctr.setAccessible(true);
        Singleton singleton3 = ctr.newInstance();
        System.out.println(singleton3.hashCode());
    }
}
