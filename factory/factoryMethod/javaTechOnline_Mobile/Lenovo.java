package tari.rahil.java.main.src.designPattern.factoryMethod.javaTechOnline_Mobile;

public class Lenovo implements Mobile{
    @Override
    public void cost() {
        System.out.println("Cost of LENOVO mobile...");
    }

    @Override
    public void pictureCapacity() {
        System.out.println("PictureCapacity of LENOVO mobile...");
    }

    @Override
    public void batteryPower() {
        System.out.println("BatteryPower of LENOVO mobile...");
    }
}
