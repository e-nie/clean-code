package practice_2.structural.decorator.after;

public class Main {
    public static void main(String[] args) {
        // было просто кофе
        Sellable coffee = new SimpleCoffee();

        System.out.println(coffee.cost());

        // на основе просто кофе построили просто кофе + молоко
        coffee = new MilkDecorator(coffee);

        System.out.println(coffee.cost());

        // на основе просто кофе + молоко построили просто кофе + молоко + сахар
        coffee = new SugarDecorator(coffee);

        System.out.println(coffee.cost());

        // на основе просто кофе + молоко + сахар построили просто кофе + молоко + сахар + молоко
        coffee = new MilkDecorator(coffee);

        System.out.println(coffee.cost());
    }
}
