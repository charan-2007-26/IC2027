package Day_6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Product_Inventory_Management {
   
     public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/day_5_tasks";
        String username="root";
        String password="Snehithudu@143";
        try {

            Connection con=DriverManager.getConnection(url, username, password);
            System.out.println("Database coneected successfully");
           
           Scanner sc=new Scanner(System.in);
           String query1="select * from products";
           PreparedStatement ps=con.prepareStatement(query1);
           System.out.println("Total products list ");       
           ps.executeQuery();
           ResultSet rs=ps.executeQuery();
            while (rs.next()) {
                System.out.println(
        "ID: " + rs.getInt("product_id") +
        ", Name: " + rs.getString("product_name") +
        ", Category: " + rs.getString("category") +
        ", Price: " + rs.getDouble("price") +
        ", Stock: " + rs.getInt("stock_quantity")
    );
        //Display products belonging to a particular category.
        System.out.println("Enter category to chect product :");
        String Category=sc.next(); 
          String query2="select * from products where category=?";
          PreparedStatement ps1=con.prepareStatement(query2);
           ps1.setString(1, Category);
           ps1.executeQuery();
           rs=ps1.executeQuery();
           while (rs.next()) {
            System.out.println(rs.getString("product_name"));
            
           }
           //Display products whose stock quantity is below 10.
           // Display products whose stock quantity is below 10
System.out.println("Display products whose stock quantity is below 10:");
String query3 = "SELECT * FROM products WHERE stock_quantity < ?";
PreparedStatement ps3=con.prepareStatement(query3);

    ps3.setInt(1, 10);

    ResultSet rs3 = ps3.executeQuery();
        boolean found = false;
        while (rs3.next()) {
            found = true;
            System.out.println(
                "ID: " + rs3.getInt("product_id") +
                ", Name: " + rs3.getString("product_name") +
                ", Category: " + rs3.getString("category") +
                ", Price: " + rs3.getDouble("price") +
                ", Stock: " + rs3.getInt("stock_quantity")
            );
        }
        if (!found) {
            System.out.println("No products found with stock quantity below 10.");
        }
    }




       
            
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
}
