package Day_4;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task_20 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> product=new LinkedHashMap<>();
        //add new products sales
        product.put("Laptop", 2);
        product.put("Mobile", 5);
        product.put("charger", 4);
        product.put("box", 6);
        product.put("bowl", 8);
        //update sales quantities
        product.put("Laptop", 10);
        product.put("Mobile", 15);
        product.put("charger", 14);
        product.put("box", 16);
        product.put("bowl", 28);
        //display all products and their sales
        System.out.println(product);
        //Calculate the total quantity of products sold.
        int tot=0;
        for (Map.Entry<String, Integer> entry : product.entrySet()) {
        String sales = entry.getKey();
        int quantity = entry.getValue();
        System.out.println(sales + ": " + quantity);
        tot+=entry.getValue();
        }
         System.out.println("Total product Sold :"+tot);
        //Display the sales report in insertion order.
        for (Map.Entry<String, Integer> entry : product.entrySet()) {
    String sales = entry.getKey();
    int quantity = entry.getValue();
    System.out.println(sales + ": " + quantity);
}

    }
    
}
