import java.util.Scanner;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        while(true){
            int input = scanner.nextInt();

            if(input < 0){
                break;
            }

            list.add(input);
        }

        ArrayList<Integer> printNumbers = list.stream().filter((Integer number) -> {
            if(number >= 1 && number <= 5){
                return true;
            }
            return false;
        })
        .collect(Collectors.toCollection(ArrayList::new));

        

        System.out.println(printNumbers);
       

        scanner.close();

    }
}
