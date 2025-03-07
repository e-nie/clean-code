package practice_2.structural.decorator.before;

public class Main {
    public static void main(String[] args) {
        CoffeeWithMilkAndSugar coffee = new CoffeeWithMilkAndSugar();
        System.out.println("Cost: $" + coffee.cost());
    }
}
