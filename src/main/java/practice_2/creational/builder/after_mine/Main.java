package practice_2.creational.builder.after_mine;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("thick", "tomato", "pepperoni");

        // Правила синтаксиса Java при создании объектов:
        // строгий порядок параметров метода (конструктора)
        // запрет на пропуск параметра

        // Pizza pizza = new Pizza("tomato", "pepperoni");

        Pizza flexiblePizza = new Pizza.Builder()
                .setSauce("tomato")
                .setTopping("mozarella")
                .build();

        System.out.println(pizza);
        System.out.println(flexiblePizza);
    }
}
