package practice_2.creational.builder.after;

public class Main {
    public static void main(String[] args) {
        // создание пиццы без строителя
        Pizza pizza = new Pizza("thick", "tomato", "pepperoni");

        // создание пиццы с строителем

        Pizza pizza1 = new Pizza.Builder()
                .setTopping("pepperoni")
                .setSauce("tomato")
                        .build();

        System.out.println(pizza);
        System.out.println(pizza1);
    }
}
