package MiniProjects.D4MiniProj2;

import java.util.*;

public class ProductInventorySystem {
    // Core required collections
    static HashMap<Integer, Integer> inventory = new HashMap<>(); // ID -> Quantity
    static HashSet<String> categories = new HashSet<>(); // Unique categories
    static LinkedHashSet<String> recentProducts = new LinkedHashSet<>(); // Insertion order product names

    // Supporting maps for product details mapped by Product ID
    static HashMap<Integer, String> productNames = new HashMap<>();
    static HashMap<Integer, String> productCategories = new HashMap<>();
    static HashMap<Integer, Double> productPrices = new HashMap<>();

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n========================================");
            System.out.println("PRODUCT INVENTORY SYSTEM");
            System.out.println("========================================");
            System.out.println("1. Add Product");
            System.out.println("2. Display All Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Product Quantity");
            System.out.println("5. Sell Product");
            System.out.println("6. Remove Product");
            System.out.println("7. Add Product Category");
            System.out.println("8. Display Unique Categories");
            System.out.println("9. Display Sorted Categories");
            System.out.println("10. Display Recently Added Products");
            System.out.println("11. Generate Inventory Report");
            System.out.println("12. Exit");
            System.out.print("Enter Your Choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> addProduct();
                case 2 -> displayAllProducts();
                case 3 -> searchProduct();
                case 4 -> updateQuantity();
                case 5 -> sellProduct();
                case 6 -> removeProduct();
                case 7 -> addCategory();
                case 8 -> displayUniqueCategories();
                case 9 -> displaySortedCategories();
                case 10 -> displayRecentProducts();
                case 11 -> generateReport();
                case 12 -> {
                    System.out.println("Exiting System...");
                    return;
                }
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }

    // Module 1: Add Product
    static void addProduct() {
        System.out.print("Product ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if (inventory.containsKey(id)) {
            System.out.println("Error: Product ID already exists!");
            return;
        }

        System.out.print("Product Name: ");
        String name = sc.nextLine();

        System.out.print("Category: ");
        String category = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Quantity: ");
        int qty = sc.nextInt();
        sc.nextLine();

        if (qty < 0) {
            System.out.println("Error: Quantity cannot be negative!");
            return;
        }

        inventory.put(id, qty);
        productNames.put(id, name);
        productCategories.put(id, category);
        productPrices.put(id, price);

        categories.add(category);
        recentProducts.add(name);

        System.out.println("Product Added Successfully!");
    }

    // Module 2: Display Products
    static void displayAllProducts() {
        if (inventory.isEmpty()) {
            System.out.println("No products in inventory.");
            return;
        }

        System.out.println("---------- PRODUCT INVENTORY ----------");
        System.out.printf("%-6s %-15s %-15s %-10s %-10s\n", "ID", "Product", "Category", "Price", "Quantity");
        for (int id : inventory.keySet()) {
            System.out.printf("%-6d %-15s %-15s %-10.2f %-10d\n",
                    id, productNames.get(id), productCategories.get(id), productPrices.get(id), inventory.get(id));
        }
        System.out.println("Total Products: " + inventory.size());
    }

    // Module 6 (Search)
    static void searchProduct() {
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        if (!inventory.containsKey(id)) {
            System.out.println("Product not found!");
            return;
        }

        System.out.println("Product: " + productNames.get(id) +
                " | Category: " + productCategories.get(id) +
                " | Price: " + productPrices.get(id) +
                " | Available Quantity: " + inventory.get(id));
    }

    // Module 6 (Increase Stock)
    static void updateQuantity() {
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        if (!inventory.containsKey(id)) {
            System.out.println("Product not found!");
            return;
        }

        System.out.print("Enter Quantity to Add: ");
        int addQty = sc.nextInt();

        if (addQty < 0) {
            System.out.println("Invalid quantity!");
            return;
        }

        inventory.put(id, inventory.get(id) + addQty);
        System.out.println("Stock Updated Successfully! New Quantity: " + inventory.get(id));
    }

    // Module 6 (Decrease Stock / Sell)
    static void sellProduct() {
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        if (!inventory.containsKey(id)) {
            System.out.println("Product not found!");
            return;
        }

        System.out.print("Enter Quantity Sold: ");
        int sold = sc.nextInt();
        int currentQty = inventory.get(id);

        if (sold <= 0) {
            System.out.println("Invalid quantity!");
        } else if (sold > currentQty) {
            System.out.println("Insufficient stock! Available: " + currentQty);
        } else {
            inventory.put(id, currentQty - sold);
            System.out.println("Sale Completed Successfully!");
            System.out.println("Product ID: " + id);
            System.out.println("Remaining Quantity: " + inventory.get(id));
        }
    }

    // Module 6 (Remove Product)
    static void removeProduct() {
        System.out.print("Enter Product ID to remove: ");
        int id = sc.nextInt();

        if (!inventory.containsKey(id)) {
            System.out.println("Product not found!");
            return;
        }

        String name = productNames.remove(id);
        inventory.remove(id);
        productCategories.remove(id);
        productPrices.remove(id);
        recentProducts.remove(name);

        System.out.println("Product removed successfully!");
    }

    // Module 3: Product Category Management
    static void addCategory() {
        System.out.print("Enter new category: ");
        String cat = sc.nextLine();
        if (categories.add(cat)) {
            System.out.println("Category added!");
        } else {
            System.out.println("Category already exists!");
        }
    }

    static void displayUniqueCategories() {
        System.out.println("--------- PRODUCT CATEGORIES ---------");
        for (String cat : categories) {
            System.out.println(cat);
        }
        System.out.println("Total Unique Categories: " + categories.size());
        System.out.println("--------------------------------------");
    }

    // Module 4: Sorted Category Display (TreeSet)
    static void displaySortedCategories() {
        if (categories.isEmpty()) {
            System.out.println("No categories available.");
            return;
        }

        TreeSet<String> sortedCategories = new TreeSet<>(categories);
        System.out.println("--------- SORTED CATEGORIES ----------");
        for (String cat : sortedCategories) {
            System.out.println(cat);
        }
        System.out.println("First Category: " + sortedCategories.first());
        System.out.println("Last Category: " + sortedCategories.last());
        System.out.println("Descending Order: " + sortedCategories.descendingSet());
        System.out.println("--------------------------------------");
    }

    // Module 5: Recently Added Products (LinkedHashSet)
    static void displayRecentProducts() {
        System.out.println("------ RECENTLY ADDED PRODUCTS -------");
        for (String prod : recentProducts) {
            System.out.println(prod);
        }
        System.out.println("--------------------------------------");
    }

    // Module 7: Inventory Report
    static void generateReport() {
        displayAllProducts();
        if (inventory.isEmpty()) return;

        int totalUnits = 0;
        int maxQty = -1;
        int maxId = -1;

        System.out.println("\n--- Low Stock Products (Below 5) ---");
        boolean lowStockFound = false;

        for (Map.Entry<Integer, Integer> entry : inventory.entrySet()) {
            int id = entry.getKey();
            int qty = entry.getValue();
            totalUnits += qty;

            if (qty < 5) {
                System.out.println(productNames.get(id) + " (ID: " + id + ") - Qty: " + qty);
                lowStockFound = true;
            }

            if (qty > maxQty) {
                maxQty = qty;
                maxId = id;
            }
        }
        if (!lowStockFound) System.out.println("None");

        System.out.println("\nTotal Product Units Available: " + totalUnits);
        System.out.println("Highest Stock Product: " + productNames.get(maxId) + " (Qty: " + maxQty + ")");
        displayUniqueCategories();
    }
}
```[cite: 1]
