package factory.factoryMethod.javaTechOnline_Mobile;
//Creator
public class MobileFactory {
    Mobile createMobile(String type) {
        Mobile mobile = null;
        if ("len".equalsIgnoreCase(type)) {
            mobile = new Lenovo();
            System.out.println("LENOVO created...");
        } else if ("sam".equalsIgnoreCase(type)) {
            mobile = new Samsung();
            System.out.println("SAMSUNG created...");
        }
        return mobile;
    }
}
