package Day_3;

import java.util.InputMismatchException;
import java.util.Scanner;

class StudentMarks{
    Scanner sc=new Scanner(System.in);
    void stdmarks(){
        try {
            System.out.println("Enter the marks for three subjects:");
            int sub1=sc.nextInt();
            int sub2=sc.nextInt();
            int sub3=sc.nextInt();
            System.out.println("Total Marks : "+(sub1+sub2+sub3)+"\nAverage : "+(sub1+sub2+sub3)/3);
        } catch (InputMismatchException e) {
            System.out.println("Enter the numerical values");
        }
    }
}

public class Task_28 {
    public static void main(String[] args) {
        StudentMarks sm=new StudentMarks();
        sm.stdmarks();

    }
    
}
