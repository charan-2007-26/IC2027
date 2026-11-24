package Day_2.Tasks21_32;
abstract class Delivery{
    void acceptOrder(){
        System.out.println("Delivery order accepted");
    }
    abstract void delivery();
}class FoodDelivery extends Delivery{
    void delivery() {
        System.out.println("Food order Delivered to customer ");
    }
}class ParcelDelivery extends Delivery{
    void delivery(){
        System.out.println("Parcel order delivered successfully");
    }
}

public class Task_24 {
    public static void main(String[] args) {
        FoodDelivery fd=new FoodDelivery();
        fd.acceptOrder();
        fd.delivery();
        ParcelDelivery pd=new ParcelDelivery();
        pd.acceptOrder();
        pd.delivery();
        
    }
    
}
