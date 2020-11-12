import java.nio.file.Files;
import java.nio.file.Paths;

 
public class LiteracyComparison {
   
    public static void main(String[] args) {
       
        try {
            Files.lines(Paths.get("literacy.csv"))
            .map(row -> row.split(","))
            .filter(parts -> parts.length >= 6)
            .sorted((p1, p2) -> {return p1[5].compareTo(p2[5]);})
            .forEach(parts -> System.out.println(parts[3].trim() + " (" + Integer.valueOf(parts[4]) + "), " +  parts[2].trim().split("\\s+")[0] + ", " + Double.valueOf(parts[5])));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}