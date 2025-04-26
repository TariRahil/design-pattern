package tari.rahil.java.main.src.designPattern.factoryMethod;

import tari.rahil.java.main.src.designPattern.factoryMethod.refactoring.guru_GUI_elements.factoryAsCreator.Dialog;
import tari.rahil.java.main.src.designPattern.factoryMethod.refactoring.guru_GUI_elements.factoryAsCreator.HtmlDialog;
import tari.rahil.java.main.src.designPattern.factoryMethod.refactoring.guru_GUI_elements.factoryAsCreator.WindowsDialog;

public class Demo {
    private static Dialog dialog;
    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

     static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

     static void runBusinessLogic() {
        dialog.renderWindow();
    }

}
