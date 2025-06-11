package tari.rahil.java.main.src.designPattern.factoryMethod.javaTechOnline_Mobile;

public class Main {
    public static void main(String[] args) {
        MobileFactory factory = new MobileFactory();

        Lenovo len = (Lenovo) factory.createMobile("len");
        len.cost();

        Samsung sam = (Samsung) factory.createMobile("sam");
        sam.cost();
    }
}
