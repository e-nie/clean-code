package practice_2.structural.decorator.after_mine;

public class CoffeeDecorator implements Coffee {
    private Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return this.coffee.cost();
    }
}
