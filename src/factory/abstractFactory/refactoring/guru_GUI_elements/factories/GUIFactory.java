package factory.abstractFactory.refactoring.guru_GUI_elements.factories;

import tari.rahil.java.main.src.designPattern.abstractFactory.refactoring.guru_GUI_elements.products.buttons.Button;
import tari.rahil.java.main.src.designPattern.abstractFactory.refactoring.guru_GUI_elements.products.checkboxes.Checkbox;

//Abstract factory
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
