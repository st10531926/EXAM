package mattresssales;

import javax.swing.*;
import java.awt.*;
import java.io.FileWritter;
import java.io.IOException;

public class ProductApp extends JFrame {
    
    private JTextField txtCustomer;
    private JTextField txtPrice;
    private JComboBox<String> cmbProduct;
    private JButton btnProcess;
    
    public ProductApp(){
        
        setTitle("Mattress Sales Application");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
         //Create form componets
        txtCustomer = new JTextField(20);
        txtPrice = new JTextField(20);
        
        String[] products = {
            "Cozy Nights Monarch"
            "Restonic Barbados"
            "Sealy Phuket"
            
        };
    cmbProduct = new JcomboBox<>(products);
    
    btnProcess = new JButton("PROCESS");
    
    //Create form layout
    JPanel panel =new JPanel(new GridLayout(4,2,10,10));
    
    panel.setBoarder(
    BoarderFactory.createEmptyBoarder(20,20,20,20)
    );
    
    panel.add(new JLable("Customer Name"));
    panel.add(txtCustomer);
    
    
    //Process button
    btnProcess.addActionListener(e processSale());
    
    //Create menus 
    JMenuBar menuBar = new JMenuBar();
    
    JMenu fileMenu =new JMenu ("File");
    
    }
}
