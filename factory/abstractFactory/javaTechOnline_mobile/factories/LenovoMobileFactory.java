package tari.rahil.java.main.src.designPattern.abstractFactory.javaTechOnline_mobile.factories;

import tari.rahil.java.main.src.designPattern.abstractFactory.javaTechOnline_mobile.products.Lenovo;

public class LenovoMobileFactory extends MobileFactory {
    public Lenovo createLenovoMobile(){
        return new Lenovo();
    }
}
