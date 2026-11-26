package Day_4;

import java.util.HashSet;

public class Task_8 {
    public static void main(String[] args) {
        HashSet<String> product=new HashSet<>();
        product.add("Rice");
        product.add("Onion");
        product.add("Garlic");
        product.add("Sweets");  
        product.add("Rice");    
        product.remove("Garlic");
        System.out.println(product.contains("Onion"));
        System.out.println(product);
        System.out.println("Total no of unique iteams :"+product.size());


    }
    
}
