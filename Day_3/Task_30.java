package Day_3;

import java.util.Scanner;

class StudentRegistration{
    Scanner sc=new Scanner(System.in);

    String StudentName=sc.nextLine();
    int age=sc.nextInt();
    String marks=sc.nextLine();
    String[] Subjects={"java","python","c"};
    
}

public class Task_30 {
    public static void main(String[] args) {
        StudentRegistration sr=new StudentRegistration();
        try {
           if(sr.StudentName==null){
            System.out.println(sr.StudentName.length());
        
           }
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception");

        }
        try {
            int mark=Integer.parseInt(sr.marks);
            System.out.println(mark);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        }
         System.out.println("Enter your choice to print subject based on index ");
         int pos=sr.sc.nextInt();
        try {
            System.out.println(sr.Subjects[pos]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }try {
            if (sr.age<0) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException");
        }
        System.out.println("Student Registration Completed");

    
}
}
