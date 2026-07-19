package practice_1.task_2.after_mine_2;

public class SimplePaymentService implements PaymentService {
    @Override
    public void processPayment(Order order) {
        if (!order.isPaid()) {
            System.out.println("Processing order: " + order.getNumber());
            order.makePayment();
        } else{
            System.out.println("Order was already paid");
        }
    }
}
