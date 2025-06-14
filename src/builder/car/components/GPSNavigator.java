package car.components;

public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "Tehran, IRAN";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute    ;
    }

    public String getRoute() {
        return route;
    }
}
