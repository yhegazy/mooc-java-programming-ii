import java.util.ArrayList;

public class OneItemBox extends Box {
    private ArrayList<Item> items;
    private int capacity;
    
    public OneItemBox(){
        this.items = new ArrayList<>();
        this.capacity = 1;
    }


    @Override
    public void add(Item item){
        /*If there is already an item in the box, it must not be switched. The weight of the item added to the box is irrelevant*/

        if(this.items.size() < this.capacity){
            this.items.add(item);
        } else if (this.items.size() == this.capacity){
            this.isInBox(item);
        }
    }
    
    @Override
    public boolean isInBox(Item comparedItem) {
        for (Item item : this.items) {
            if (item.equals(comparedItem)) {
                return true;
            }
        }
        return false;
    }
}