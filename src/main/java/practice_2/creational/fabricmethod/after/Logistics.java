package practice_2.creational.fabricmethod.after;

/**
 * Класс для управления разными типами доставки.
 */
public abstract class Logistics {
    // фабричный метод, которому мы делегируем создание транспорта
    abstract Transport createTransport();

    void planLogistic() {
        Transport transport = createTransport();
        transport.deliver();
    }
}
