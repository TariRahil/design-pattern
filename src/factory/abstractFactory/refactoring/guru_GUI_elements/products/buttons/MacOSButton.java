package factory.abstractFactory.refactoring.guru_GUI_elements.products.buttons;

public class MacOSButton implements Button{
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton...");
    }
}
