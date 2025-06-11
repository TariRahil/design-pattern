package factory.factoryMethod.javaTechOnline_Mobile;

public class Samsung implements Mobile{
    @Override
    public void cost() {
        System.out.println("Cost of SAMSUNG mobile...");
    }

    @Override
    public void pictureCapacity() {
        System.out.println("PictureCapacity of SAMSUNG mobile...");
    }

    @Override
    public void batteryPower() {
        System.out.println("BatteryPower of SAMSUNG mobile...");
    }
}
