public class CustomTacoBox implements TacoBox{
    private int tacos;
    
    public CustomTacoBox(int tacos){
        this.tacos = tacos;
    }
    
    public int tacosRemaining(){
        if(this.tacos > 0){
            return this.tacos;
        }
        return 0;
    }
    
    public void eat(){
        this.tacos -= 1;
    }
    
}
