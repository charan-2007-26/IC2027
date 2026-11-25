package Day_3;

import java.util.Scanner;

class ShoppingCart{
    String[] product={"laptop","mouse","headphones","keyboard"};
}

public class Task_23 {
    public static void main(String[] args) {
        ShoppingCart Sc=new ShoppingCart();
        Scanner sc=new Scanner(System.in);
         System.out.println("Select the product based on index");
         int pos=sc.nextInt();
        try {
           System.out.println(Sc.product[pos]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of bound");
           
        }
        
    }
    

    
}
