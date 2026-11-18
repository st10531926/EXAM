public class Product implements Iproducts {
    
    private String[]  products;
    private int [][] sales;
    
    public product(String[]  products , int[][] sales ) {
        this.products  = products ;
        this.sales = sales ;
    }
    
    @override 
    public int GetTotalProductsSold() {
         int total = 0;
          for (int i = 0; i < sales.length; i++) {
              for (int j = 0;j<sales [i].length;j++)
                  total+= sales[i][j];
          }
    }
     return total;
}

    
