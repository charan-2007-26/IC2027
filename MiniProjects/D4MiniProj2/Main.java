import java.util.*;

class Product {

    int productId;
    String name;
    String category;
    int price;
    int quantity;

    Product(int productId, String name, String category,
            int price, int quantity) {

        this.productId = productId;
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    void displayProduct() {
        System.out.println(
            productId + " | " + name + " | " +
            category + " | " + price + " | " + quantity
        );
    }
}

class Inventory {

    HashMap<Integer, Product> products = new HashMap<>();

    HashSet<String> categories = new HashSet<>();

    // Add product
    void addProduct(Product p) {

        if (products.containsKey(p.productId)) {
            System.out.println("Product ID already exists!");
            return;
        }

        products.put(p.productId, p);
        categories.add(p.category);

        System.out.println("Product added successfully!");
    }

    // Display products
    void displayProducts() {

        if (products.isEmpty()) {
            System.out.println("No products available!");
            return;
        }

        for (Product p : products.values()) {
            p.displayProduct();
        }

        System.out.println("Total products: " + products.size());
    }

    // Search product
    void searchProduct(int productId) {

        if (products.containsKey(productId)) {
            products.get(productId).displayProduct();
        } else {
            System.out.println("Product not found!");
        }
    }

    // Update quantity
    void updateQuantity(int productId, int quantity) {

        if (products.containsKey(productId)) {

            if (quantity < 0) {
                System.out.println("Invalid quantity!");
                return;
            }

            products.get(productId).quantity = quantity;

            System.out.println("Quantity updated successfully!");

        } else {
            System.out.println("Product not found!");
        }
    }

    // Display categories
    void displayCategories() {

        System.out.println("Categories:");

        for (String category : categories) {
            System.out.println(category);
        }
    }

    // Delete product
    void deleteProduct(int productId) {

        Product removed = products.remove(productId);

        if (removed != null) {

            // Rebuild categories to remove unused categories
            categories.clear();

            for (Product p : products.values()) {
                categories.add(p.category);
            }

            System.out.println("Product deleted successfully!");

        } else {
            System.out.println("Product not found!");
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Inventory inventory = new Inventory();

        int choice;

        do {

            System.out.println("\n===== PRODUCT INVENTORY SYSTEM =====");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Quantity");
            System.out.println("5. Display Categories");
            System.out.println("6. Delete Product");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Category: ");
                    String category = sc.nextLine();

                    System.out.print("Enter Price: ");
                    int price = sc.nextInt();

                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    if (price < 0 || quantity < 0) {
                        System.out.println("Invalid price or quantity!");
                        break;
                    }

                    Product p = new Product(
                        id, name, category, price, quantity
                    );

                    inventory.addProduct(p);

                    break;

                case 2:

                    inventory.displayProducts();

                    break;

                case 3:

                    System.out.print("Enter Product ID: ");
                    id = sc.nextInt();

                    inventory.searchProduct(id);

                    break;

                case 4:

                    System.out.print("Enter Product ID: ");
                    id = sc.nextInt();

                    System.out.print("Enter New Quantity: ");
                    quantity = sc.nextInt();

                    inventory.updateQuantity(id, quantity);

                    break;

                case 5:

                    inventory.displayCategories();

                    break;

                case 6:

                    System.out.print("Enter Product ID: ");
                    id = sc.nextInt();

                    inventory.deleteProduct(id);

                    break;

                case 7:

                    System.out.println("Thank you!");

                    break;

                default:

                    System.out.println("Invalid choice!");
            }

        } while (choice != 7);

        
    }
}