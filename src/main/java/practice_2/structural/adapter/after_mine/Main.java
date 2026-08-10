package practice_2.structural.adapter.after_mine;

public class Main {
    public static void main(String[] args) {
        FahrenheitThermometer fThermometer = new FahrenheitThermometer();
        WeatherApp app = new WeatherApp();

        // Проблема: FahrenheitThermometer возвращает значение в Фаренгейтах
        CelsiusAdapter celsiusAdapter = new CelsiusAdapter(fThermometer);

        app.printTemperature(celsiusAdapter.getCelsius()); // Неудобно и повторяющееся преобразование
    }
}
