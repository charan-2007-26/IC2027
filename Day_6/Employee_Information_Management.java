package Day_6;

import java.sql.*;
import java.util.Scanner;

public class Employee_Information_Management {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/day_5_tasks";
        String username="root";
        String password="Snehithudu@143";
        try {

            Connection con=DriverManager.getConnection(url, username, password);
            System.out.println("Database coneected successfully");
           /*  String query="insert into employees values(?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(query);
            ps.setInt(1, 101);
            ps.setString(2, "charan");
            ps.setString(3, "SDE");
            ps.setDouble(4, 100000.00);
            ps.setString(5, "Development");
            ps.executeUpdate();
            */
           Scanner sc=new Scanner(System.in);
           String query1="select * from employees where employee_id=?";
           PreparedStatement ps=con.prepareStatement(query1);
           System.out.println("Search for an employee using employee ID :");
           int id=sc.nextInt();
           ps.setInt(1, id);
           ps.executeQuery();
           ResultSet rs=ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("employee_id"));
                System.out.println(rs.getString("employee_name"));
                System.out.println(rs.getString("designation"));
                System.out.println(rs.getInt("salary"));
                System.out.println(rs.getString("department"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
