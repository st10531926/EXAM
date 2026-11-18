package mattresssales;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductCalculationsTest {
    @Test
    public void GetVat_withValidData_ReturnCorrectValue(){
        ProductCalculations product =
                new ProductCalculations(3500);
        assertEquals(525.0, product.GetVat(),0.01);
        
    }
    @Test
    public void GetTotal_WithValidData_ReturnCorrectValue() {
        ProductCalculations product =
                new ProductCalculations(3500);
        assertEquals(4200.0,product.GetTotal(),0.01);
    }
}
