package practice_2.structural.decorator.after;

public class SugarDecorator extends CoffeeDecorator {
    // на основе кофе с сахаром построй все то же самое + сахар
    // на основе кофе с молоком построй все то же самое + сахар
    public SugarDecorator(Sellable coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return super.cost() + 0.1;
    }
}
