package Day_1;
import java.util.Scanner;

public class Calculator {   
 public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Calculator cal=new Calculator();
        System.out.println("Simple Calculator");
        System.out.println("Enter a number");
        int a=sc.nextInt();
        System.out.println("Enter b number");
        int b=sc.nextInt();
        System.out.println("Enter which operation do you want perform:");
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("Enter your choice:");
        int ch=sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Addition = "+cal.Addition(a,b));
                break;

            case 2:
                System.out.println("Substraction = "+cal.Addition(a,b));
                break;
             case 3:
                System.out.println("Multiplication = "+cal.Addition(a,b));
                break; 
            case 4:
                System.out.println("Division = "+cal.Addition(a,b));
                break;
        
            default:
                System.out.println("choice a correct option");
                break;
        }

    }
     int Addition(int a,int b){
        return a+b;
    }
    int Sub(int a,int b){
        return a-b;
    }
    int Mul(int a,int b){
        return a*b;
    }
    int Div(int a,int b){
        return a/b;
    }
    
}
