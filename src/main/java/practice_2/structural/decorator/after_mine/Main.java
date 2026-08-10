package practice_2.structural.decorator.after_mine;

public class Main {
    public static void main(String[] args) {

        /*
        Если завтра мы начнем расширение коффейни и у нас добавится 100 топпингов:

        Создать классы для всех возможных комбинций топинга между собой:

        Пример: у нас есть сироп с миндалем, карамелью и шоколадом

        кофе с минадлем
        кофе с миндалем и карамелью
        кофе с миндалем и шоколадом
        кофе с миндалем карамелью и шоколадом

        количество комбинаторных комбинаций будет расти расти и расти
         */

        /*
        Идея решения:

        Давайте сделаем простой кофе и реализуем декораторы (слои для добавлениия к кофе):
        Декоратор молока
        Декоратор сахара

        Использование:
        1) Цель: сделать кофе с молоком

        беру простой кофе
        декорирую (добавление нового слоя) простой кофе молоком -> кофе с молоком

        2) Цель: сделать кофе с сахаром

        беру простой кофе
        декорирую (добавление нового слоя) простой кофе сахаром -> кофе с сахаром

        3) Цель: Кофе с молоком и сахаром

        беру простой кофе
        декорирую простой кофе с молоком сахаром -> кофе с молоком и сахаром

         */

//        1) Цель: сделать кофе с молоком
        Coffee coffee = new SimpleCoffee();
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.cost());

        // 2) Цель: сделать кофе с сахаром
        Coffee coffeeWithSugar = new SimpleCoffee();
        coffeeWithSugar = new SugarDecorator(coffeeWithSugar);
        System.out.println(coffeeWithSugar.cost());

        // 3) Цель: Кофе с молоком и сахаром

        Coffee coffeeWithSugarAndMilk = new SimpleCoffee();//простой кофе
        coffeeWithSugarAndMilk = new SugarDecorator(coffeeWithSugarAndMilk);//простой кофе с сахаром
        coffeeWithSugarAndMilk = new MilkDecorator(coffeeWithSugarAndMilk);// простой кофе с сахаром и молоком
        System.out.println(coffeeWithSugarAndMilk.cost());// распечатали стоимость простого кофе с сахаром и молоком
    }
}
