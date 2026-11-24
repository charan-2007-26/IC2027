package Day_2.Tasks21_32;
class Product{
    String ProductName;
    int quantity;
    double price;
    Product(){
        ProductName="UNKnown";
        quantity=1;
        price=100;
    }
    Product(String productName){
        this.ProductName=productName;
        
    }
    Product(String productName, int quantity, double price){
        this.ProductName=productName;
        this.quantity=quantity;
        this.price=price;
    }
    void calculateTotal(){
        System.out.println("Total Price: ₹" + (quantity * price));
    }
}

public class Task_31 {
    public static void main(String[] args) {
        Product pd=new Product();
        pd.calculateTotal();
        Product pd2=new Product("Rice");
        pd2.calculateTotal();
        Product pd3=new Product("Bullet rice",10,1500);
        pd3.calculateTotal();

        
    }
}
