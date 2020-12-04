
import java.util.Random;

public class Die {

    private Random random;
    private int numberOfFaces;

    public Die(int numberOfFaces) {
        this.random = new Random();
        // Initialize the value of numberOfFaces here
        this.numberOfFaces = numberOfFaces;
        //this.random.nextInt(numberOfFaces);
    }

    public int throwDie() {
        Random random = new Random();
        //Number of faced die thrown X amount of times. Find X.
        return this.random.nextInt(this.numberOfFaces) +1;
    }
}