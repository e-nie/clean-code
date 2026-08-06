package practice_2.creational.fabricmethod.after_mine;

/**
 * класс для управления логистикой доставок
 */
public abstract class Logistics {
    //это фабричный метод, так как он реализует способ создания транспорта
    abstract Transport createTransport();

    public void planDelivery(){
        Transport transport = createTransport();
        transport.deliver();
    }

}
