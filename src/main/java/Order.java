import java.util.ArrayList;
import java.util.List;

public class Order {
    String orderId;
    List<LP> products;

    public Order(String orderId){
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public String getOrderId(){
        return orderId;
    }

    public List<LP> getProducts(){
        return products;
    }

    public void addLP(int quantity, String productId){
        LP product = new LP(quantity,productId);
        products.add(product);
    }

    public LP getLP(int element){
        return products.get(element);
    }
}
