package practice_2.creational.fabricmethod.after;

public class SkyLogistic extends Logistics{
    @Override
    Transport createTransport() {
        return new Plane();
    }
}
