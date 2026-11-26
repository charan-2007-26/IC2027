package Day_4;

import java.util.ArrayList;

public class Task_2 {
    public static void main(String[] args) {
       ArrayList<String> Cart=new ArrayList<>();
       Cart.add("Laptop");
       Cart.add("Mobile");
       Cart.add("Keyboard");
       Cart.remove(0);
       Cart.add(0,"PC");
       System.out.println(Cart);
       System.out.println(Cart.contains("Laptop"));
       System.out.println("total no products :"+Cart.size());
       Cart.clear();
       System.out.println(Cart);
    }
    
}
