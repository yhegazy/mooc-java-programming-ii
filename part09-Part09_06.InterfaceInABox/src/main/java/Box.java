import java.util.ArrayList;

public class Box implements Packable {
    private double maximumCapacity;
    private ArrayList<Packable> itemList;

    public Box(double maximumCapacity){
        this.maximumCapacity = maximumCapacity;
        this.itemList = new ArrayList<>();
    }

    public double weight(){
        double weight = 0.0;
        for(Packable item : this.itemList){
            weight += item.weight();
        }
        return weight;
    }

   public void add(Packable packable){
       if(packable.weight() + this.weight() <= this.maximumCapacity){
           this.itemList.add(packable);
       }
   }

   @Override
    public String toString(){
        return "Box: " + this.itemList.size() + " items, total weight " + this.weight() +  " kg";
    }

    
}