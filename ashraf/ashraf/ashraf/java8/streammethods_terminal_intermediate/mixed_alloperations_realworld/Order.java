package ashraf.ashraf.ashraf.ashraf.java8.streammethods_terminal_intermediate.mixed_alloperations_realworld;

public class Order {
    private int orderId;
    private String customerName;
    private String orderStatus;
    private double price;
    private String paymentMethods;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(String paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customerName='" + customerName + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                ", price=" + price +
                ", paymentMethods='" + paymentMethods + '\'' +
                '}';
    }

    public Order(int orderId, String customerName, String orderStatus, double price, String paymentMethods) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderStatus = orderStatus;
        this.price = price;
        this.paymentMethods = paymentMethods;
    }
}
