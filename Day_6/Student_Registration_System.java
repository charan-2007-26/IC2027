package Day_6;

import java.sql.*;
import java.util.Scanner;

public class Student_Registration_System {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String url="jdbc:mysql://localhost:3306/day_5_tasks";
        String username="root";
        String password="Snehithudu@143";
         
        try {
            //Establish a JDBC connection with MySQL.
            Connection con=DriverManager.getConnection(url, username, password);
            System.out.println("Database connected successfully");
            String query="insert into students values(?,?,?,?,?);";
            //Accept student details from the user.
            PreparedStatement ps=con.prepareStatement(query);
            System.out.println("enter student details to save the details into database");
            System.out.print("enter student id :");
            int id=sc.nextInt();
            System.out.print("enter student name  :");
            String name=sc.next();
            System.out.print("enter student age :");
            int age=sc.nextInt();
            System.out.print("enter department :");
            String department=sc.next();
            System.out.print("enter student email :");
            String email=sc.next();
            // seting the user inputs to the database fields
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, age);
            ps.setString(4, department);
            ps.setString(5, email);
            ps.executeUpdate();
            //Display a success message after insertion.
            System.out.println("Data successfully insterted into the database!!!!!!");

            //Retrieve and display all registered students.
            String query1="select * from students;";
            PreparedStatement ps1=con.prepareStatement(query1);
            ResultSet rs=ps1.executeQuery(query1);

            while (rs.next()) {
                System.out.println("Student _id :"+rs.getInt("student_id"));
                System.out.println("Student_name "+rs.getString("student_name"));
                System.out.println("Student_age "+rs.getInt("age"));
                System.out.println("Student department "+rs.getString("department"));
                System.out.println("Student_email "+rs.getString("email"));


                
            }
            
        } catch (Exception e) {
           System.out.println(e);

           
        }
       
    }
    
}