package tari.rahil.java.main.src.designPattern.abstractFactory.refactoring.guru_GUI_elements.factories;

import tari.rahil.java.main.src.designPattern.abstractFactory.refactoring.guru_GUI_elements.products.buttons.Button;
import tari.rahil.java.main.src.designPattern.abstractFactory.refactoring.guru_GUI_elements.products.buttons.MacOSButton;
import tari.rahil.java.main.src.designPattern.abstractFactory.refactoring.guru_GUI_elements.products.checkboxes.Checkbox;
import tari.rahil.java.main.src.designPattern.abstractFactory.refactoring.guru_GUI_elements.products.checkboxes.MacOSCheckbox;
//Concrete factory
public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
