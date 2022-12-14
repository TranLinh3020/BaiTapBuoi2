public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerID() {
        return customer.getId();
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public int getCustomerDiscount() {
        return customer.getDiscount();
    }

    public double getAmountAfterDiscount() {
        return amount - amount * customer.getDiscount() / 100;
    }

    public String toString() {
        return "Invoice[id=" + this.id + "," + customer.toString() + ",amount=" + this.amount + "]";
    }

    public static void main(String[] args) {
        Customer customer1 = new Customer(88, "Tan Ah Teck", 8);
        Invoice invoice = new Invoice(101, customer1, 999.9);
        System.out.println(invoice);
        System.out.println("id is: " + invoice.getId());
        System.out.println("customer is: " + customer1.toString());
        System.out.println("anount is: " + invoice.getAmount());
        System.out.println("customer's id is: " + customer1.getId());
        System.out.println("customer's name is: " + customer1.getName());
        System.out.println("customer's discount is: " + customer1.getDiscount());
        System.out.println("amount after discount is: " + invoice.getAmountAfterDiscount());
    }
}
