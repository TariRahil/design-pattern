package factory.abstractFactory.refactoring.guru_GUI_elements.products.checkboxes;

public class MacOSCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox...");
    }
}
