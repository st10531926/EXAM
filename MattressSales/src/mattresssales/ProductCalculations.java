package mattresssales;

public class ProductCalculations implements IProductionCalculations{
    
    private double price;
    
    public ProductionCalculations(double price) {
        this.price =price;
    }
    @override
    public double GetVat() {
        return price *0.15;
        
    }
    @override
    public double GetCommision() {
        return price *0.05;
    }
    public double GetTotal() {
        return price + GetVat()+GetCommission();
    }
}
