package car.builders;

import car.cars.CarType;
import car.components.Engine;
import car.components.GPSNavigator;
import car.components.Transmission;
import car.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
