import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Literature> list = new ArrayList<>();

        while(true){
            System.out.println("Input the name of the book, empty stops: ");
            String book = scanner.nextLine();

            if(book.isEmpty()){
                break;
            }

            System.out.println("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextLine());

            String row = book + "," + age;
            list.add(new Literature(book, age));
        }

        System.out.println(list.stream().count() + " books in total.");

        Comparator<Literature> comparator = Comparator.comparing(Literature::getAge).thenComparing(Literature::getBook);

        Collections.sort(list, comparator);
       
        System.out.println("Books: ");
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }       

        scanner.close();
    }

}
