
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the random number generation here
        // Must be in a range of 1 - 40
        Random random = new Random();

        while(containsNumber(random.nextInt(40)+1)){
           
            for(int i = 0; i < 7; i++){
            

                this.numbers.add(random.nextInt(40) + 1);
            }
            
        }
    }
        

    public boolean containsNumber(int number) {

        for(int nmbr: this.numbers){
            if(number == nmbr){
                return false;
            }
        }
      
        return true;
    }
}

