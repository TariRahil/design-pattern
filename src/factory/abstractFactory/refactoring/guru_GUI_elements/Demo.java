package factory.abstractFactory.refactoring.guru_GUI_elements;

import tari.rahil.java.main.src.designPattern.abstractFactory.refactoring.guru_GUI_elements.app.Application;
import factory.abstractFactory.refactoring.guru_GUI_elements.factories.GUIFactory;
import factory.abstractFactory.refactoring.guru_GUI_elements.factories.MacOSFactory;
import factory.abstractFactory.refactoring.guru_GUI_elements.factories.WindowsFactory;

public class Demo {
    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }

    private static Application configureApplication() {
        Application application;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        application = new Application(factory);
        return application;
    }
}
