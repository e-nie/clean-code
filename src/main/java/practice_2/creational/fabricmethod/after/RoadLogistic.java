package practice_2.creational.fabricmethod.after;

public class RoadLogistic extends Logistics {
    @Override
    Transport createTransport() {
        return new Truck();
    }
}
