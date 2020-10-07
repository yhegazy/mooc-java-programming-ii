
import java.util.HashMap;

public class Abbreviations {
    
    private HashMap<String, String> hashmap;

    public Abbreviations(){
        this.hashmap = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation){
        this.hashmap.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation){
        if(this.hashmap.containsKey(abbreviation)){
            return true;
        }
        return false;
    }

    public String findExplanationFor(String abbreviation){
        return this.hashmap.get(abbreviation);
    }
}
