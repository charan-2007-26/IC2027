package Day_5.JDBConnect;
import java.sql.*;
import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //url
       String url="jdbc:mysql://localhost:3306/college";
        //username
        String username="root";
        //password
        String password="Snehithudu@143";
        try {
            //establish connection
        Connection con=DriverManager.getConnection(url, username, password);
        System.out.println("database connected");
         //inserting the values to the database through java program
        //String query="insert into students values(107,'charan',19,'csd','Bangalore')";
       /*  Statement st=con.createStatement();
        st.executeUpdate(query);*/
           
        //inserting the values saperately to the database
        /*String query="insert into students values(?,?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(query);
        ps.setInt(1, 101);
        ps.setString(2, "dhanush");
        ps.setInt(3, 19);
        ps.setString(4, "cse");
        ps.setString(5, "Bangarupalyam");
        ps.executeUpdate();*/

        //inserting the values to the database by user inputs
        System.out.println("enter values to insert the data to thed database ");
        System.out.println("Enter id number :");
        int id=sc.nextInt();
        System.out.println("Enter name :");
        String name=sc.next();
        System.out.println("Enter age :");
        int age=sc.nextInt();
        System.out.println("Enter Department :");
        String department=sc.next();
        System.out.println("Enter location :");
        String location=sc.next();


        String query="insert into students values(?,?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(query);
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setInt(3, 19);
        ps.setString(4, department);
        ps.setString(5, location);
        ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("error");
        }
    }
    
}
