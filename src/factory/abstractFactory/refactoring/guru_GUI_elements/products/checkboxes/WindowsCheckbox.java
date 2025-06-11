package factory.abstractFactory.refactoring.guru_GUI_elements.products.checkboxes;

public class WindowsCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox...");
    }
}
