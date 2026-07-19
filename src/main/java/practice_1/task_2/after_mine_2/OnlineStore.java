package practice_1.task_2.after_mine_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OnlineStore {
    private List<Order> orders = new ArrayList<>();
    private PaymentService paymentService;
    private DiscountStrategy discountStrategy;
    private BulkOrderStrategy bulkOrderStrategy;

    public OnlineStore(PaymentService paymentService, DiscountStrategy discountStrategy, BulkOrderStrategy bulkOrderStrategy) {
        this.paymentService = paymentService;
        this.discountStrategy = discountStrategy;
        this.bulkOrderStrategy = bulkOrderStrategy;
    }


    public void addOrder(Order order) {
        orders.add(order);
    }

    private List<Product> getActualProductList(List<Product> productList) {
        List<Product> actualProductList = new ArrayList<>();
        for (Product product : productList) {
            if (product.isInStock()) {
                actualProductList.add(product);
            }
        }
        return actualProductList;
    }

    public void processOrders() {
        for (Order order : orders) {
            System.out.println();
            System.out.println("### Start processing the Order:  " + order.getNumber() + " ###");

            //Step 1: сформировать список товаров в наличии
            System.out.println("Start preparing the actual product list for Order:  " + order.getNumber());

            //Step 2: обновляем заказ актуальным списокм товаров в наличии
            List<Product> actualProductList = getActualProductList(order.getProductList());
            order.setProductList(actualProductList);
            System.out.println("Actual list for order: " + order.getNumber());
            order.printProductList();
            if (actualProductList.isEmpty()) {
                System.out.println("The order does not contain actual products");
            } else {

                //Step 3: вычисляем скидку на основании общей цены
                System.out.println("Start calculating the discount for Order:  " + order.getNumber());
                double finalPrice = discountStrategy.applyDiscount(order.calculateTotalPrice());
                order.setTotalPrice(finalPrice);
                System.out.println("Final price for order: " + order.getNumber() + " is " + finalPrice);
                //Step 4: отправка запроса на покупку оптом
                bulkOrderStrategy.createBulkOrder(order);
                System.out.println("Product bulk order checked for Order: " + order.getNumber());
            }
            System.out.println("### Stop processing Order: " + order.getNumber() + " ###");
        }
    }
}

