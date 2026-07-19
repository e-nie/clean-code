package practice_1.task_2.after_mine_2;

public class LaptopBulkOrderStrategy implements BulkOrderStrategy {
    @Override
    public void createBulkOrder(Order order) {
        order.getProductList().forEach(p -> {
            if (p.getName().equals("Laptop") && p.getQuantity() > 3) {
                System.out.println("Bulk order for Laptops processed!");
            }
        });
    }
}