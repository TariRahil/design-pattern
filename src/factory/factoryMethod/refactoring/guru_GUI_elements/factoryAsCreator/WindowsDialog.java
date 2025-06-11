package factory.factoryMethod.refactoring.guru_GUI_elements.factoryAsCreator;

import tari.rahil.java.main.src.designPattern.factoryMethod.refactoring.guru_GUI_elements.buttonsAsProduct.Button;
import tari.rahil.java.main.src.designPattern.factoryMethod.refactoring.guru_GUI_elements.buttonsAsProduct.WindowsButton;
//One more concrete creator
public class WindowsDialog extends Dialog{
    @Override
    protected Button createButton() {
        return new WindowsButton();
    }
}
