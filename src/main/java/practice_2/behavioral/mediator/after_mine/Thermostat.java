package practice_2.behavioral.mediator.after_mine;

class Thermostat {
    private Mediator mediator;

    public void setTemperature(int temperature) {
        System.out.println("Temperature set to " + temperature + "C");
    }
}
