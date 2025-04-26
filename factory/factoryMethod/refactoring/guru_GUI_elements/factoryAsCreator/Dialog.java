package tari.rahil.java.main.src.designPattern.factoryMethod.refactoring.guru_GUI_elements.factoryAsCreator;

import tari.rahil.java.main.src.designPattern.factoryMethod.refactoring.guru_GUI_elements.buttonsAsProduct.Button;

//Base Creator
public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    protected abstract Button createButton();
}
