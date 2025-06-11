package factory.abstractFactory.refactoring.guru_GUI_elements.factories;

import tari.rahil.java.main.src.designPattern.abstractFactory.refactoring.guru_GUI_elements.products.buttons.Button;
import tari.rahil.java.main.src.designPattern.abstractFactory.refactoring.guru_GUI_elements.products.buttons.WindowsButton;
import tari.rahil.java.main.src.designPattern.abstractFactory.refactoring.guru_GUI_elements.products.checkboxes.Checkbox;
import tari.rahil.java.main.src.designPattern.abstractFactory.refactoring.guru_GUI_elements.products.checkboxes.WindowsCheckbox;
//Concrete factory
public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
