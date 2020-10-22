public class ProductWarehouseWithHistory extends ProductWarehouse {
    
    private ChangeHistory changeHistory;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        this.changeHistory = new ChangeHistory();
        this.setBalance(initialBalance);    
        this.changeHistory.add(initialBalance);
    }
    
    public String history(){  
        
        return this.changeHistory.toString();
    }

    @Override
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        this.changeHistory.add(this.getBalance());
    }
     
    @Override
    public double takeFromWarehouse(double amount) {
        double realAmount = super.takeFromWarehouse(amount);
        this.changeHistory.add(this.getBalance());
        return realAmount;
    }

    public void printAnalysis(){
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + this.history().toString());
        System.out.println("Largest amount of product: " + this.changeHistory.maxValue());
        System.out.println("Smallest amount of product: " + this.changeHistory.minValue());
        System.out.println("Average: " + this.changeHistory.average());
    }
}
