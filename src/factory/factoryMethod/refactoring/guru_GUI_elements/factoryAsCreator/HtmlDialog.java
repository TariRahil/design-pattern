package factory.factoryMethod.refactoring.guru_GUI_elements.factoryAsCreator;

import tari.rahil.java.main.src.designPattern.factoryMethod.refactoring.guru_GUI_elements.buttonsAsProduct.Button;
import tari.rahil.java.main.src.designPattern.factoryMethod.refactoring.guru_GUI_elements.buttonsAsProduct.HtmlButton;
//Cocrete creator
public class HtmlDialog extends Dialog{
    @Override
    protected Button createButton() {
        return new HtmlButton();
    }
}
