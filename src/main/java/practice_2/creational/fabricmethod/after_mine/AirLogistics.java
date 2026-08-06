package practice_2.creational.fabricmethod.after_mine;

public class AirLogistics extends Logistics{
    @Override
    Transport createTransport() {
        return new Plane();
    }
}
