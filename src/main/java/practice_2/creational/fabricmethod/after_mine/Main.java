package practice_2.creational.fabricmethod.after_mine;

public class Main {
    public static void main(String[] args) {
        Logistics logistics;

        String transportType = "ship"; // Тип может быть основан на входных данных или конфигурации

        //the code should be open for extension, but closed for modification
        if ("truck".equals(transportType)) {
            logistics = new LandLogistics();//делегирован фабричному методу CreateTransport
        } else if ("ship".equals("transportType")) {
            logistics = new SeaLogistics(); //делегирован фабричному методу CreateTransport
        } else {
            logistics = new AirLogistics(); //делегирован фабричному методу CreateTransport
        }

        logistics.planDelivery();
    }
}
