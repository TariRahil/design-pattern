package car.cars;

import car.components.Engine;
import car.components.GPSNavigator;
import car.components.Transmission;
import car.components.TripComputer;

public class Manual {
    private final CarType type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(CarType type, int seats, Engine engine, Transmission transmission,
                  TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        String info = "";
        info += "Type of car: " + type + "\n";
        info += "Count of seats: " + seats + "\n";
        info += "Engin: volume - " + engine.getVolume() + "; mileAge - " + engine.getMileage() + "\n";
        info += "Transmission: " + transmission + "\n";
        if (this.tripComputer != null) {
            info += "Trip computer: functional" + "\n";
        } else {
            info += "Trip computer: N/A" + "\n";
        }
        if (this.gpsNavigator != null) {
            info += "GPS navigator: functional" + "\n";
        } else {
            info += "GPS navigator: N/A" + "\n";
        }

        return info;
    }
}
