package practice_2.behavioral.mediator.after_mine;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Alarm alarm = new Alarm();
        Thermostat thermostat = new Thermostat();

        // Представим, что у нас есть сложный сценарий, где эти устройства взаимодействуют:

        HomeMediator homeMediator = new HomeMediator(light, alarm, thermostat);
        homeMediator.notify(thermostat, "morning");
    }
}
