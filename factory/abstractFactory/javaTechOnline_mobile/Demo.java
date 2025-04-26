package tari.rahil.java.main.src.designPattern.abstractFactory.javaTechOnline_mobile;

import tari.rahil.java.main.src.designPattern.abstractFactory.javaTechOnline_mobile.factories.LenovoMobileFactory;
import tari.rahil.java.main.src.designPattern.abstractFactory.javaTechOnline_mobile.factories.MobileFactory;
import tari.rahil.java.main.src.designPattern.abstractFactory.javaTechOnline_mobile.products.Lenovo;

public class Demo {
    public static void main(String[] args) {
        MobileFactory mobileFactories = new MobileFactory();
        LenovoMobileFactory lmf = (LenovoMobileFactory) mobileFactories.createMobile("lenF");
        Lenovo ln = lmf.createLenovoMobile();
        ln.cost();
    }
}
