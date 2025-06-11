package tari.rahil.java.main.src.designPattern.abstractFactory.refactoring.guru_GUI_elements.products.buttons;

public class WindowsButton implements Button{
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton...");
    }
}
