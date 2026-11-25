package Day_3;

import java.util.Scanner;

class OrderProcessing{
    String productName="Laptop";
    String quantity="2";
    double[] productPrices={45000.0,50000.0,65000};
}

public class Task_31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        OrderProcessing op=new OrderProcessing();
        try {
            int Quantity=Integer.parseInt(op.quantity);//NumberFormatException
            System.out.println("Enter index to choose productprice");
            int pos=sc.nextInt();
            System.out.println(op.productPrices[pos]);//arrayIndexoutof bound
            System.out.println("TotalPrice :"+op.productPrices[pos]*Quantity);

        } catch (NumberFormatException e) {
            System.out.println("number format exception");
           
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out bound exception");
        }
        finally{
            System.out.println("Order processing completed");
        }
    }
    
}
