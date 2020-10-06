public class Container {
    private int container;
    
    public Container(){
        this.container = 0;
    }
    
    
    public int contains(){
        return this.container;
    }
    
    public void add(int amount){
        if(amount < 0){
            amount = 0;
            this.container += amount;
        }
                    
        if(amount < 0 && this.container > 100){
            this.container = 100;
        } else {
            this.container += amount;
            if(this.container > 100){
                this.container = 100;
            }
        }
    }
    
    public void remove(int amount){
        if(amount > this.container){
            this.container = 0;
        
        } else {
            this.container -= amount;
        }
    }
    
    public String toString(){
        return this.container + "/100";
    }
    
    
    
}
