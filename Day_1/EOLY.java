package Day_1;

import java.util.Scanner;

public class EOLY {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check even or odd and leap year");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("Even");
            if(num%4==0){
                System.out.println("Normal Year");
            }else{
                 System.out.println("Leap Year");
            }
        }else{
            System.out.println("ODD");
           
        }
    }
    
}
