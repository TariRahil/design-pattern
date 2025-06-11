package factory.factoryMethod;

import factory.factoryMethod.refactoring.guru_GUI_elements.factoryAsCreator.Dialog;
import factory.factoryMethod.refactoring.guru_GUI_elements.factoryAsCreator.HtmlDialog;
import factory.factoryMethod.refactoring.guru_GUI_elements.factoryAsCreator.WindowsDialog;

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
