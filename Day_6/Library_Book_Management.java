package Day_6;

import java.sql.*;
import java.util.Scanner;

public class Library_Book_Management {
    private Connection conn;
    private static final Scanner sc = new Scanner(System.in);

    public Library_Book_Management() {
        String url = "jdbc:mysql://localhost:3306/day_5_tasks";
        String user = "root";
        String password = "Snehithudu@143";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.conn = DriverManager.getConnection(url, user, password);
            System.out.println("Database connected!");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Failed to connect to database.");
            e.printStackTrace();
        }
    }

    public void AddBook() {
        String sql = "INSERT INTO books (book_id, book_name, author, category, available_copies) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            System.out.print("Enter Book ID: ");
            int id = Integer.parseInt(sc.nextLine().trim());
            System.out.print("Enter Book Name: ");
            String name = sc.nextLine().trim();
            System.out.print("Enter Author: ");
            String author = sc.nextLine().trim();
            System.out.print("Enter Category: ");
            String category = sc.nextLine().trim();
            System.out.print("Enter Available Copies: ");
            int copies = Integer.parseInt(sc.nextLine().trim());

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, author);
            ps.setString(4, category);
            ps.setInt(5, copies);

            int rows = ps.executeUpdate();
            System.out.println(rows + " book added.");
        } catch (SQLException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public void Display() {
        String sql = "SELECT book_id, book_name, author, category, available_copies FROM books";
        try (PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            printBooks(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void SearchBookById() {
        String sql = "SELECT book_id, book_name, author, category, available_copies FROM books WHERE book_id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            System.out.print("Enter Book ID: ");
            int id = Integer.parseInt(sc.nextLine().trim());
            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {
                printBooks(rs);
            }
        } catch (SQLException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public void searchByAuthor() {
        String sql = "SELECT book_id, book_name, author, category, available_copies FROM books WHERE author LIKE ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            System.out.print("Enter Author Name: ");
            String author = sc.nextLine().trim();
            ps.setString(1, "%" + author + "%");

            try (ResultSet rs = ps.executeQuery()) {
                printBooks(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void findByCategory() {
        String sql = "SELECT book_id, book_name, author, category, available_copies FROM books WHERE category = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            System.out.print("Enter Category: ");
            String category = sc.nextLine().trim();
            ps.setString(1, category);

            try (ResultSet rs = ps.executeQuery()) {
                printBooks(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateStock() {
        String sql = "UPDATE books SET available_copies = ? WHERE book_id = ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            System.out.print("Enter Book ID: ");
            int id = Integer.parseInt(sc.nextLine().trim());
            System.out.print("Enter New Available Copies: ");
            int copies = Integer.parseInt(sc.nextLine().trim());

            ps.setInt(1, copies);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();
            System.out.println(rows + " record updated.");
        } catch (SQLException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public void outOfStock() {
        String sql = "SELECT book_id, book_name, author, category, available_copies FROM books WHERE available_copies = 0";
        try (PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            printBooks(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void printBooks(ResultSet rs) throws SQLException {
        boolean found = false;
        while (rs.next()) {
            found = true;
            System.out.println(
                rs.getInt("book_id") + " | " +
                rs.getString("book_name") + " | " +
                rs.getString("author") + " | " +
                rs.getString("category") + " | Copies: " +
                rs.getInt("available_copies")
            );
        }
        if (!found) {
            System.out.println("No books found.");
        }
    }

    public static void main(String[] args) {
        Library_Book_Management lbm = new Library_Book_Management();
        if (lbm.conn == null) {
            return;
        }

        while (true) {
            System.out.println("\n1. Add new books.");
            System.out.println("2. Display all books.");
            System.out.println("3. Search books using book ID.");
            System.out.println("4. Search books using author name.");
            System.out.println("5. Display books belonging to a particular category.");
            System.out.println("6. Update available copies.");
            System.out.println("7. Display books with zero available copies.");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            int ch = Integer.parseInt(sc.nextLine().trim());

            switch (ch) {
                case 1:
                    lbm.AddBook();
                    break;
                case 2:
                    lbm.Display();
                    break;
                case 3:
                    lbm.SearchBookById();
                    break;
                case 4:
                    lbm.searchByAuthor();
                    break;
                case 5:
                    lbm.findByCategory();
                    break;
                case 6:
                    lbm.updateStock();
                    break;
                case 7:
                    lbm.outOfStock();
                    break;
                case 8:
                    System.out.println("Exiting.........");
                    try {
                        lbm.conn.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    return;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }
}