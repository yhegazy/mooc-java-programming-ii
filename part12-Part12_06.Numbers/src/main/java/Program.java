
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many random nubers should be printed?");
        
        int input = scanner.nextInt();
        
        Random ladyLuck = new Random();
                
        for(int i = 0; i < input; i++){
            System.out.println(ladyLuck.nextInt(11));
            
        }
    }

}
