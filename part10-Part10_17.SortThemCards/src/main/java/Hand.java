import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Hand implements Comparable<Hand>{
    private ArrayList<Card> hand;

    public Hand(){
        this.hand = new ArrayList<>();
    }

    public void add(Card card){
        this.hand.add(card);
    }

    public void print(){
        for (Card card: this.hand){
            System.out.println(card);
        }
    }

    public void sort(){
        Collections.sort(hand);
    }

    @Override
    public int compareTo(Hand hand){
        int thisValue = this.hand.stream().map(card -> card.getValue()).reduce(0, (a,b) -> a + b);

        int handValue = hand.hand.stream().map(card -> card.getValue()).reduce(0, (a,b) -> a + b);
    
        return thisValue - handValue;        
    }

    public void sortBySuit(){
        Collections.sort(this.hand, new BySuitInValueOrder());
    }
}
