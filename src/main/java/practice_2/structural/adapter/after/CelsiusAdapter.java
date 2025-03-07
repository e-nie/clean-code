package practice_2.structural.adapter.after;

public class CelsiusAdapter {
    private FahrenheitThermometer fahrenheitThermometer;

    public CelsiusAdapter(FahrenheitThermometer fahrenheitThermometer) {
        this.fahrenheitThermometer = fahrenheitThermometer;
    }

    public double getTemperature() {
        double fTemp = fahrenheitThermometer.getFahrenheitTemperature();
        double cTemp = (fTemp - 32) * 5.0 / 9.0; // Преобразование в Цельсий
        return cTemp;
    }
}
