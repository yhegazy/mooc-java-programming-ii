import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ShoppingCart {
    private Map<String, Item> cart;

    public ShoppingCart(){
        this.cart = new HashMap<>();
    }

    public void add(String product, int price){
        int quantity = 1;
        Item item = new Item(product, quantity, price);
        
        if(this.cart.containsKey(product)){
            this.cart.get(product).increaseQuantity();
        } else {
            this.cart.put(product, item);
        }
        
        quantity++;
    }

    public int price(){
        Set<String> products = this.cart.keySet();
        Collection<String> productsCollection = products;
       
        int price = 0;
        
        for(String product: productsCollection){
            if(this.cart.containsKey(product)){
                price += this.cart.get(product).price();
            }           
        }
        
        if(this.cart.isEmpty()){
            return 0;
        } else {
            return price;
        }
    }

    public void print(){
        Collection<Item> quantity = this.cart.values();
        
        for(Item qty : quantity){
            if(this.cart.containsValue(qty)){
                System.out.println(qty);
            }
        }
    }    
}
