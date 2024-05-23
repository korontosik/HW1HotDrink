import java.util.List;

interface VendingMachine {
    
    void initProducts(List<Product> productList);

    void addProductList(Product product);

    Product getProduct(String name);
    

    
}
