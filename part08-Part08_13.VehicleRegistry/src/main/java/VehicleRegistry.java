import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry(){
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner){
        if(!(this.registry.containsKey(licensePlate))){
            this.registry.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate){
        return this.registry.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate){
        if(this.registry.containsKey(licensePlate)){
            this.registry.remove(licensePlate);
            return true;
        }   
        return false;
    }

    public void printLicensePlates(){
        for(LicensePlate plate: this.registry.keySet()){
            if(this.registry.containsKey(plate)){
                System.out.println(plate);
            }
        }
    }

    public void printOwners(){

        ArrayList<String> nameCheck = new ArrayList<>();
        
        for(String owner: this.registry.values()){
           if(!(nameCheck.contains(owner))){
                nameCheck.add(owner);
                System.out.println(owner);
            }
        }
    }
}
