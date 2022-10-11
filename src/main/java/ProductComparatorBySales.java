import java.util.Comparator;

public class ProductComparatorBySales implements Comparator<Product> {
    public int compare(Product product1, Product product2) {
        return (product1.getNumSales() - product2.getNumSales());
    }
}
