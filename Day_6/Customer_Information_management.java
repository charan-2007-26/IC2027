package Day_6;

import java.sql.*;
import java.util.Scanner;

public class Customer_Information_management {
        Scanner sc=new Scanner(System.in);
        String url="jdbc:mysql://localhost:3306/day_5_tasks";
        String username="root";
        String password="Snehithudu@143";
    //Register a new customer.
    public static void RegisterNewCust(){
        Customer_Information_management cs=new Customer_Information_management();

        try {
            Connection con=DriverManager.getConnection(cs.url, cs.username, cs.password);
            //System.out.println("Database connected");
            String query="insert into customers values(?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(query);
            System.out.println("--enter customer details--");
            System.out.print("Enter customer id:");
            int id=cs.sc.nextInt();
            System.out.print("Enter customer name :");
            String custName=cs.sc.next();
            System.out.print("Enter customer email :");
            String email=cs.sc.next();
            System.out.print("Enter customer Ph Number :");
            String phoneNo=cs.sc.next();
            System.out.print("Enter customer city :");
            String city=cs.sc.next();

            ps.setInt(1, id);
            ps.setString(2, custName);
            ps.setString(3, email);
            ps.setString(4, phoneNo);
            ps.setString(5, city);
            ps.executeUpdate();
            System.out.println("Customer added successfully");
        } catch (Exception e) {
           System.out.println("error!!! not connected");
        }


    }
        
    //Display all customers.
    public static void DisplayAllCust(){
        Customer_Information_management cs=new Customer_Information_management();
       try {
            Connection con=DriverManager.getConnection(cs.url, cs.username, cs.password);
            //System.out.println("Database connected");
            String query="select * from  customers";
            PreparedStatement ps=con.prepareStatement(query);
            ps.executeQuery();
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {
                System.out.println("customer_id :"+rs.getInt("cust_id"));
                System.out.println("customer_Name :"+rs.getString("cust_name"));
                System.out.println("customer_email :"+rs.getString("email"));
                System.out.println("customer_phone no :"+rs.getString("phone"));
                System.out.println("location :"+rs.getString("city"));
                
            }
        } catch (Exception e) {
           System.out.println("error!!! not connected");
        }


    }



    
    //Search customers using customer ID.
    public static void SearchByID(){
        Customer_Information_management cs=new Customer_Information_management();
        try {
            Connection con=DriverManager.getConnection(cs.url, cs.username, cs.password);
            //System.out.println("Database connected");
            String query="select * from  customers where Cust_id=?";
            PreparedStatement ps=con.prepareStatement(query);
            System.out.println("Search customers using customer ID.");
            int id=cs.sc.nextInt();
            ps.setInt(1, id);
            ps.executeQuery();
            ResultSet rs=ps.executeQuery();
            if (rs.next()) {
            
            while (rs.next()) {
                System.out.println("customer_id :"+rs.getInt("cust_id"));
                System.out.println("customer_Name :"+rs.getString("cust_name"));
                System.out.println("customer_email :"+rs.getString("email"));
                System.out.println("customer_phone no :"+rs.getString("phone"));
                System.out.println("location :"+rs.getString("city"));
                
            }
        }else{
            System.out.println("No customer found");
        }
        } catch (Exception e) {
           System.out.println("error!!! not connected");
        }
    }
    //Search customers using their phone number.
    public static void SearchByPhoneNo(){
        Customer_Information_management cs=new Customer_Information_management();
         try {
            Connection con=DriverManager.getConnection(cs.url, cs.username, cs.password);
            //System.out.println("Database connected");
            String query="select * from  customers where phone=?";
            PreparedStatement ps=con.prepareStatement(query);
            System.out.println("Search customers using customer Phone number.");
            String Phone_number=cs.sc.next();
            ps.setString(1, Phone_number);
            ps.executeQuery();
            ResultSet rs=ps.executeQuery();
            if (rs.next()) {
                
            while (rs.next()) {
                System.out.println("customer_id :"+rs.getInt("cust_id"));
                System.out.println("customer_Name :"+rs.getString("cust_name"));
                System.out.println("customer_email :"+rs.getString("email"));
                System.out.println("customer_phone no :"+rs.getString("phone"));
                System.out.println("location :"+rs.getString("city"));
            }   
           }else{
            System.out.println(" no customer is found.");
           }
        } catch (Exception e) {
           System.out.println("error!!! not connected");
        }



    }
    //Display customers from a particular city.
    public static void SearchByCity(){
        Customer_Information_management cs=new Customer_Information_management();
        try {
            Connection con=DriverManager.getConnection(cs.url, cs.username, cs.password);
            //System.out.println("Database connected");
            String query="select * from  customers where city=?";
            PreparedStatement ps=con.prepareStatement(query);
            System.out.println("Search customers using customer city.");
            String city=cs.sc.next();
            ps.setString(1, city);
            ps.executeQuery();
            ResultSet rs=ps.executeQuery();
            if (rs.next()) {
                
            while (rs.next()) {
                System.out.println("customer_id :"+rs.getInt("cust_id"));
                System.out.println("customer_Name :"+rs.getString("cust_name"));
                System.out.println("customer_email :"+rs.getString("email"));
                System.out.println("customer_phone no :"+rs.getString("phone"));
                System.out.println("location :"+rs.getString("city"));
                
            }
        }else{
            System.out.println("No customer found");
        }
        } catch (Exception e) {
           System.out.println("error!!! not connected");
        }



    }

    public static void main(String[] args) {
        Customer_Information_management cs=new Customer_Information_management();

        //establishing db connection
        System.out.println("--Customer Information Management--");
        System.out.println("1.Register a new customer.\r\n" + //
                        "2.Display all customers.\r\n" + //
                        "3.Search customers using customer ID.\r\n" + //
                        "4.Search customers using their phone number.\r\n" + //
                        "5.Display customers from a particular city.\r\n"+//
                        "6.Exit");
        System.out.print("Enter your choice :");
        int ch=cs.sc.nextInt();
        switch (ch) {
            case 1:RegisterNewCust();
                break;
            case 2:DisplayAllCust();
                break;
            case 3:SearchByID();
                break;        
            case 4:SearchByPhoneNo();
                break;
            case 5:SearchByCity();
                break; 
            case 6:
                System.out.println("Exiting application...");
                 break;        
            default:
                break;
        }

            
        
       

        
    }
    
}
