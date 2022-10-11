import java.util.List;

public class ProductManagerImpl implements ProductManager {
    List<Product> productsList;
    List<Order> ordersList;
    List<Order> ordersProcessedList;
    List<User> usersList;

    public List<Product> productsByPrice() {

    }

    public List<Product> productsBySales() {

    }

    public void addOrder(Order order) {
        this.ordersList.add(order);
    }

    public Order processOrder() {
        //Procesar la orden falta
        Order processedOrder = ordersList.get(0);
        ordersList.remove(0);
        ordersProcessedList.add(processedOrder);
        return processedOrder;
    }

    public List<Order> ordersByUser(String userId) {

    }

    public void addUser(String s, String name, String surname) {
        User newUser = new User(s, name, surname);
        this.usersList.add(newUser);
    }

    public void addProduct(String productId, String name, double price) {
        Product newProduct = new Product(productId, name, price);
        this.productsList.add(newProduct);
    }

    public Product getProduct(String productId) {

    }

    public int numUsers() {
        return usersList.size();
    }

    public int numProducts() {
        return productsList.size();
    }

    public int numOrders() {
        return ordersList.size();
    }

    public int numSales(String b001) {

    }
}
