package factory.abstractFactory.javaTechOnline_mobile.factories;

import factory.abstractFactory.javaTechOnline_mobile.abstractFactory.MobileFactories;

public class MobileFactory implements MobileFactories {
    @Override
    public MobileFactories createMobile(String type) {
        MobileFactories mobile = null;
        if ("lenF".equalsIgnoreCase(type)){
            mobile = new LenovoMobileFactory();
        } else if ("samF".equalsIgnoreCase(type)){
            mobile = new SamsungMobileFactory();
        }
        return mobile;
    }
}
