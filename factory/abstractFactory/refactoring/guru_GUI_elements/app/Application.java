package tari.rahil.java.main.src.designPattern.abstractFactory.refactoring.guru_GUI_elements.app;

import tari.rahil.java.main.src.designPattern.abstractFactory.refactoring.guru_GUI_elements.factories.GUIFactory;
import tari.rahil.java.main.src.designPattern.abstractFactory.refactoring.guru_GUI_elements.products.buttons.Button;
import tari.rahil.java.main.src.designPattern.abstractFactory.refactoring.guru_GUI_elements.products.checkboxes.Checkbox;
//Client code
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
