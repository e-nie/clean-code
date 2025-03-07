package practice_2.structural.decorator.after;

public class MilkDecorator extends CoffeeDecorator {
    // на основе кофе с сахаром построй все то же самое + молоко
    // на основе кофе с молоком построй все то же самое + молоко
    public MilkDecorator(Sellable coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return super.cost() + 0.2;
    }
}
