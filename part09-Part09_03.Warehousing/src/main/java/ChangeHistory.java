import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> value;
    
    public ChangeHistory(){
        this.value = new ArrayList<>();
    }
    
    public void add(double status){
        this.value.add(status);
    }
    
    public void clear(){
        this.value.clear();
    }
    
    public String toString(){
        return this.value.toString();
    }
    
    public double maxValue(){
        if(this.value.isEmpty()){
            return 0.0;
        }
        
        double initValue = this.value.get(0);
        for(int i = 1; i < this.value.size(); i++){
            if (this.value.get(i) > initValue){
                initValue = this.value.get(i);
            }
        }
        return initValue;
    }
    
    public double minValue(){
        if(this.value.isEmpty()){
            return 0.0;
        }
        
        double initValue = this.value.get(0);
        for(int i = 1; i < this.value.size(); i++){
            if (this.value.get(i) < initValue){
                initValue = this.value.get(i);
            }
        }
        return initValue;
    }
    
    public double average(){
        if(this.value.isEmpty()){
            return 0.0;
        }
        
        double sum = 0;
        for(double number: this.value){
            sum += number;
        }
        
        return sum / this.value.size();
    }
}
