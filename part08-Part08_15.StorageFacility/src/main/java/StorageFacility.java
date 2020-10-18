import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> locker;

    public StorageFacility(){
        this.locker = new HashMap<>();
    }

    public void add(String unit, String item){

        this.locker.putIfAbsent(unit, new ArrayList<>());
        ArrayList<String> storageUnit = this.locker.get(unit);
        storageUnit.add(item);
    }
    
    public ArrayList<String> contents(String storageUnit){
        return this.locker.getOrDefault(storageUnit, new ArrayList<>());  
    }

    public void remove(String storageUnit, String item){
        //HashMap<String, ArrayList>

        ArrayList<String> storageLookup = this.locker.get(storageUnit);
        
        this.locker.remove(storageUnit, storageLookup.remove(item));
    }

    public ArrayList<String> storageUnits(){
        //sysout(key) if value > 0
        ArrayList<String> unitLookup = new ArrayList<>();

        for(String unit: this.locker.keySet()){
            ArrayList<String> itemLookup = this.locker.get(unit);

            if(itemLookup.size() > 0){
                unitLookup.add(unit);
            }
        }            
        return unitLookup;
    }
}
