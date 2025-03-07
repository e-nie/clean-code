package practice_2.structural.decorator.after;

// Декорирование 1 уровня:
// беру простое кофе и на основе него строю кофе с молоком
//
// Декорирование 2 уровня:
// беру кофе с молоком и на основе него строю кофе с молоком и сахаром
public class CoffeeDecorator implements Sellable {
    private Sellable coffee;

    public CoffeeDecorator(Sellable coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return coffee.cost();
    }
}
