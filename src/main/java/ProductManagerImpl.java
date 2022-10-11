import java.util.List;
import java.util.Objects;

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
        ordersList.add(order);
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
        usersList.add(newUser);
    }

    public void addProduct(String productId, String name, double price) {
        Product newProduct = new Product(productId, name, price);
        productsList.add(newProduct);
    }

    public Product getProduct(String productId) {
        Product getProduct = new Product("","",0);
        int i = 0;
        boolean found = false;
        while(i<productsList.size() && !found)
        {
            if(Objects.equals(productsList.get(i).getProductId(), productId)){
                getProduct=productsList.get(i);
                found = true;
            }
            i++;
        }
        return getProduct;
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
        return getProduct(b001).getNumSales();
    }
}
