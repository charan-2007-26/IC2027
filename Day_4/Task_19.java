package Day_4;

import java.util.LinkedHashMap;

public class Task_19 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> Order=new LinkedHashMap<>();
        //Add new orders 
        Order.put(101, "laptop");
        Order.put(102, "mobile");
        Order.put(103, "keyboard");
        Order.put(104, "keypad");
        Order.put(105, "pc");
        //update customer information for existing order
        if (Order.containsValue("keyboard")) {
            Order.replace(103, "Touchpad");
        }
        
        //cancel an order
        Order.remove(105);
        //Search for an order its ID
        System.out.println(Order.get(101));
        System.out.println(Order.get(102));
        //Display order in the order they were recieved
        System.out.println(Order);
        



    }
    
}
