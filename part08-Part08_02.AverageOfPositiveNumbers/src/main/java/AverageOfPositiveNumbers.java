
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum         = 0;
        int count       = 0;
       
        while(true){
            int number = scanner.nextInt();
        
            if(number == 0 ){
                System.out.println("Cannot calculate the average");
                break;
            } else if(number > 0) {
                sum += number;
                count++;
            }    
        }
        
        System.out.println( (double) sum / count);
    }
}
