package factory.factoryMethod.refactoring.guru_GUI_elements.buttonsAsProduct;
//Concrete product
public class HtmlButton implements Button{
    @Override
    public void render() {
        System.out.println("<button>HTML test button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says: 'Hello World from HTML'");
    }
}
