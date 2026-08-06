package practice_2.creational.fabricmethod.after_mine;

public class LandLogistics extends  Logistics{
    @Override
    Transport createTransport() {
        return new Truck();
    }
}
