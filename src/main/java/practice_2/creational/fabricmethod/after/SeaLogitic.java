package practice_2.creational.fabricmethod.after;

public class SeaLogitic extends Logistics {
    @Override
    Transport createTransport() {
        return new Ship();
    }
}
