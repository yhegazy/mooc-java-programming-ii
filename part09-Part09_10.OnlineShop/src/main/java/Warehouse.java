import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> warehouseProducts;
    private Map<String, Integer> warehouseStock;
   
    public Warehouse(){
        this.warehouseProducts = new HashMap<>();    
        this.warehouseStock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock){
        this.warehouseProducts.put(product, price);  
        this.warehouseStock.put(product, stock); 
    }

    public int price(String product){
        if(this.warehouseProducts.get(product) == null){
            return -99;
        }
        return this.warehouseProducts.get(product);
    }
    
    public int stock(String product){
        if(this.warehouseStock.get(product) == null){
            return 0;
        } else {
            return this.warehouseStock.get(product);
        }
    }

    public boolean take(String product){
        if(this.warehouseStock.get(product) == null || this.warehouseStock.get(product) <= 0){
            return false;
        } else {
            this.warehouseStock.put(product, (this.warehouseStock.get(product) -1));
            return true;
        }
    }
    
    public Set<String> products(){
        return this.warehouseProducts.keySet();
    }
}
