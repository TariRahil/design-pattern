package car;

import car.builders.CarBuilder;
import car.builders.ManualBuilder;
import car.cars.Car;
import car.cars.Manual;
import car.director.Director;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.constructCityCar(carBuilder);

        Car car = carBuilder.getResult();
        System.out.println("Car Built: " + car.getType());

        ManualBuilder manualBuilder = new ManualBuilder();
        director.constructCityCar(manualBuilder);

        Manual manual = manualBuilder.getResult();
        System.out.println("\nCar Manual Built: \n" + manual.print());
    }
}
