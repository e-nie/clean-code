package practice_2.creational.fabricmethod.after_mine;

public class SeaLogistics extends Logistics{

    @Override
    Transport createTransport() {
        return new Ship();
    }
}
