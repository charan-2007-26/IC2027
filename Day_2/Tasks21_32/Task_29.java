package Day_2.Tasks21_32;
class Mobile{
    String brand;
    double price;
    Mobile(){
        brand="Samsung";
        price=97000.10;
    }
    void displayDetails(){
        System.out.println("Brand :"+brand+" Price :"+price);
    }
}

public class Task_29 {
    public static void main(String[] args) {
        Mobile mobile=new Mobile();
        mobile.displayDetails();
    }
}
