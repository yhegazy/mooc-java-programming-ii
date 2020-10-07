
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
    }
    
    public static void printKeys(HashMap<String, String> hashmap){
        System.out.println(hashmap.keySet());
        
    }
    
    public static void printKeysWhere(HashMap<String, String> hashmap, String text){
        for (String item : hashmap.keySet()){
            if(item.contains(text)){
                System.out.println(item);
            }
        }
    }
    
    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text){
        for (String item : hashmap.keySet()){
            if(item.contains(text)){
                System.out.println(hashmap.get(item));
            }
        }
        
    }

}
