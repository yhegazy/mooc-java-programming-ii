
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        while(true){
            String input = scanner.nextLine();

            if(input.isEmpty()){
                break;
            }

            list.add(input);
        }

        String outputInput = list.stream().reduce("", (userInput, word) -> userInput + word + "\n");

        System.out.println(outputInput);
        

        scanner.close();

    }
}
