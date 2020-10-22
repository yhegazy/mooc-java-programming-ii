import java.util.ArrayList;

public class MisplacingBox extends Box {
    private ArrayList<Item> itemList;
    
    public MisplacingBox(){
        this.itemList = new ArrayList<>();
        
    }
    
    @Override
    public void add(Item item){
       this.itemList.add(item);
     }
    
    @Override
    public boolean isInBox(Item comparedItem) {
        for (Item item : this.itemList) {
            if (item.equals(comparedItem)) {
                return false;
            }
        }
        return false;
    }   
}
