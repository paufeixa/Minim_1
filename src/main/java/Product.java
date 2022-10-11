public class Product {
    String productId;
    String name;
    double price;
    double numSales;

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

    public double getNumSales(){
        return numSales;
    }
}