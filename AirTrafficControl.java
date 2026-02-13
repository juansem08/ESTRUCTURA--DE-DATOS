// AirTrafficControl.java
public class AirTrafficControl {

    // Single instance created when the class is loaded
    private static final AirTrafficControl instance = new AirTrafficControl();

    // Private constructor prevents external instantiation
    private AirTrafficControl() {}

    // Global access point
    public static AirTrafficControl getInstance() {
        return instance;
    }

    // Functional method
    public void authorizeLanding(String flight) {
        System.out.println("Flight " + flight + " cleared to land.");
    }

    // Quick test
    public static void main(String[] args) {
        AirTrafficControl atc1 = AirTrafficControl.getInstance();
        AirTrafficControl atc2 = AirTrafficControl.getInstance();

        atc1.authorizeLanding("AA101");
        System.out.println(atc1 == atc2); // true → same instance
    }
}
