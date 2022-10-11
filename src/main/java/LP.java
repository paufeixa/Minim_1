public class LP {
    int quantity;
    String productId;

    public LP(int quantity, String productId){
        this.quantity = quantity;
        this.productId = productId;
    }

    public int getQuantity(){
        return quantity;
    }

    public String getProductId(){
        return productId;
    }
}
