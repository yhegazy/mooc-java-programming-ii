
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

        scanner.close();
    }

    public static List<Book> readBooks(String file){
        List<Book> rows = new ArrayList<>();

        try {
            Files.lines(Paths.get(file))
                // splitting the row into parts on the ";" character
                .map(row -> row.split(","))
                // deleting the split rows that have less than 4 parts (we want the rows to always contain the name, publishing year, page count and author)
                .filter(parts -> parts.length >= 4)
                // creating books from the parts
                .map(parts -> new Book(parts[0], Integer.valueOf(parts[1]), Integer.valueOf(parts[2]), parts[3]))
                // and finally add the books to the list
                .forEach(book -> rows.add(book));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        

        return rows;
        
    }
}
