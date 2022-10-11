import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductManagerImpl implements ProductManager {
    List<Product> productsList;
    List<Order> ordersList;
    List<Order> ordersProcessedList;
    List<User> usersList;

    public ProductManagerImpl(){
        this.productsList = new ArrayList<>();
        this.ordersList = new ArrayList<>();
        this.ordersProcessedList = new ArrayList<>();
        this.usersList = new ArrayList<>();
    }

    public List<Product> productsByPrice() {
        productsList.sort(new ProductComparatorByPrice());
        return productsList;
    }

    public List<Product> productsBySales() {
        productsList.sort(new ProductComparatorBySales());
        return productsList;
    }

    public void addOrder(Order order) {
        ordersList.add(order);
    }

    public Order processOrder() throws NoOrdersException {
        if (ordersList.size() == 0) {
            throw new NoOrdersException();
        }
        Order processedOrder = ordersList.get(0);
        List<LP> elements = processedOrder.getProducts();
        for(LP element : elements) {
            Product product = getProduct(element.getProductId());
            int index = productsList.indexOf(product);
            product.newSales(element.getQuantity());
            productsList.set(index, product);
        }
        ordersList.remove(0);
        ordersProcessedList.add(processedOrder);
        return processedOrder;
    }

    public List<Order> ordersByUser(String userId) {
        List<Order> ordersByUser = new ArrayList<>();
        int i = 0;
        while(i<ordersProcessedList.size())
        {
            if(Objects.equals(ordersProcessedList.get(i).getOrderId(), userId)){
                ordersByUser.add(ordersProcessedList.get(i));
            }
            i++;
        }
        return ordersByUser;
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
