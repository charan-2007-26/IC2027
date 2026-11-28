package Day_6;

import java.sql.*;
import java.util.Scanner;

public class Bank_Account_Management {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        String url="jdbc:mysql://localhost:3306/day_5_tasks";
        String username="root";
        String password="Snehithudu@143";
        //establish connection to database
        try {
             Connection con =DriverManager.getConnection(url, username, password);
            System.out.println("connected");
            //deposit money from an account
            String update="update bank_accounts set balance=? where account_id=?";
            PreparedStatement ps1=con.prepareStatement(update);
            System.out.println("Search for an account using account ID.");
            System.out.println("enter account id :");
            int custId=sc.nextInt();
             System.out.println("enter balance:");
            double balance=sc.nextDouble();
            ps1.setDouble(1, balance);
            ps1.setInt(2, custId);
            ps1.executeUpdate();
            
          String query="select * from bank_accounts";
            PreparedStatement ps=con.prepareStatement(query);
            ps.executeQuery();
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("account_id"));
                 System.out.println(rs.getString("customer_name"));
                  System.out.println(rs.getString("account_type"));
                   System.out.println(rs.getInt("balance"));
                   
            } 

        } catch (Exception e) {
           System.out.println(e);
        }
    }
    
}
