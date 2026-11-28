package Day_6;

import java.sql.*;
import java.util.Scanner;

public class Employee_Salary_Update_Management {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String url="jdbc:mysql://localhost:3306/day_5_tasks";
        String username="root";
        String password="Snehithudu@143";
        //establish connection to database
        try {
            Connection con =DriverManager.getConnection(url, username, password);
            System.out.println("connected");
           /*  String update="update employees set salary=? where employee_id=?";
            PreparedStatement ps1=con.prepareStatement(update);
            System.out.println("update the employee salary using employee id");
            System.out.println("enter employee id :");
            int id=sc.nextInt();
             System.out.println("enter salary :");
            double salary=sc.nextDouble();
            ps1.setDouble(1, salary);
            ps1.setInt(2, id);
            ps1.executeUpdate();*/
            //delete record
             String update="delete from employees where employee_id=?";
            PreparedStatement ps1=con.prepareStatement(update);
            System.out.println("delete the employees records using employee id");
            System.out.println("enter employee id :");
            int id=sc.nextInt();
            ps1.setInt(1, id);
            ps1.executeUpdate();
            
            
            String query="select * from employees";
            PreparedStatement ps=con.prepareStatement(query);
            ps.executeQuery();
            ResultSet rs=ps.executeQuery();
            if (rs.next()) {
                while (rs.next()) {
                    System.out.println(rs.getInt("employee_id"));
                    System.out.println(rs.getString("employee_name"));
                    System.out.println(rs.getString("designation"));
                    System.out.println(rs.getDouble("salary"));
                    System.out.println(rs.getString("department"));
                    
                }
                
            }else
                {
                    System.out.println("employee ID does not exist.");
                }
    
            
        } catch (Exception e) {
           System.out.println(e);
        }
        
    
    }
}
