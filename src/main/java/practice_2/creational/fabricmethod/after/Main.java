package practice_2.creational.fabricmethod.after;

public class Main {
    public static void main(String[] args) {
        Logistics logistics;

        String transportType = "truck";

        if ("truck".equals(transportType)) {
            logistics = new RoadLogistic();
        } else {
            logistics = new SeaLogitic();
        }

        logistics.planLogistic();
    }
}
