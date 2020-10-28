import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {
    private List<Movable> coordinates;
   
    public Herd(){
        this.coordinates = new ArrayList<>();
    }

    public void addToHerd(Movable movable){
        this.coordinates.add(movable);  
    }

    public String toString(){
        String comma = "";
        for(Movable movable: this.coordinates){
            comma += movable + "\n";
        }
        return comma;
    }

    @Override
    public void move(int dx, int dy){
        for(Movable movable: this.coordinates){
            movable.move(dx, dy);
        }
        
    }
    
}
