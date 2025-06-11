package tari.rahil.java.main.src.designPattern.abstractFactory.javaTechOnline_mobile.factories;

import tari.rahil.java.main.src.designPattern.abstractFactory.javaTechOnline_mobile.products.Samsung;

public class SamsungMobileFactory extends MobileFactory{
    Samsung createSamsungMobile() {
        return new Samsung();
    }
}
