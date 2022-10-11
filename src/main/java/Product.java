public class Product {
    String productID;
    String name;
    double price;
    double numSales;

    public Product(String productID, String name, double price){
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.numSales = 0;
    }

    public String getProductId(){
        return productID;
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