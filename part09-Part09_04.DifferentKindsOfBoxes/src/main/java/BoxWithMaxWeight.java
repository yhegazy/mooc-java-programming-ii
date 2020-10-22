import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private ArrayList<Item> items;
    private int maxWeight;
    
    public BoxWithMaxWeight(int capacity){
        this.items = new ArrayList<>();
        this.maxWeight = capacity;
    }
    
    @Override
    public void add(Item item){
        int actualWeight = this.maxWeight;
        
        for(Item addedItem: this.items){
            actualWeight -= addedItem.getWeight();
        }
        
        if(item.getWeight() <= actualWeight){
            this.items.add(item);
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