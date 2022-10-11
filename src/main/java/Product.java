public class Product {
    String productId;
    String name;
    double price;
    int numSales;

    public Product(String productId, String name, double price){
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.numSales = 0;
    }

    public String getProductId(){
        return productId;
    }

    public String getDescription(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getNumSales(){
        return numSales;
    }

    public void newSales(int quantity){
        numSales = numSales + quantity;
    }
}