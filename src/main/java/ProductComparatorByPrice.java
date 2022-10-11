import java.util.Comparator;

public class ProductComparatorByPrice implements Comparator<Product> {
    public int compare(Product product1, Product product2) {
        return (int)((product1.getPrice() - product2.getPrice())*1000);
    }
}
