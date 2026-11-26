package Day_4;
 import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_26 {
       public static void main(String[] args) {
        HashMap<String, Double> accounts = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Create Account  2. Deposit  3. Withdraw  4. Check Balance  5. Close Account  6. Display All  7. Total Balance  8. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    String newAcc = sc.next();
                    if (accounts.containsKey(newAcc)) {
                        System.out.println("Account already exists.");
                    } else {
                        System.out.print("Enter Initial Deposit: ");
                        double initBal = sc.nextDouble();
                        accounts.put(newAcc, initBal);
                        System.out.println("Account created.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    String depAcc = sc.next();
                    if (accounts.containsKey(depAcc)) {
                        System.out.print("Enter Deposit Amount: ");
                        double amount = sc.nextDouble();
                        accounts.put(depAcc, accounts.get(depAcc) + amount);
                        System.out.println("Deposited successfully.");
                    } else {
                        System.out.println("Account does not exist.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    String withAcc = sc.next();
                    if (accounts.containsKey(withAcc)) {
                        System.out.print("Enter Withdrawal Amount: ");
                        double amount = sc.nextDouble();
                        double currentBal = accounts.get(withAcc);
                        if (amount <= currentBal) {
                            accounts.put(withAcc, currentBal - amount);
                            System.out.println("Withdrawn successfully.");
                        } else {
                            System.out.println("Insufficient balance.");
                        }
                    } else {
                        System.out.println("Account does not exist.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    String checkAcc = sc.next();
                    if (accounts.containsKey(checkAcc)) {
                        System.out.println("Balance: " + accounts.getOrDefault(checkAcc, 0.0));
                    } else {
                        System.out.println("Account does not exist.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Account Number to close: ");
                    String remAcc = sc.next();
                    if (accounts.remove(remAcc) != null) {
                        System.out.println("Account closed.");
                    } else {
                        System.out.println("Account does not exist.");
                    }
                    break;

                case 6:
                    if (accounts.isEmpty()) {
                        System.out.println("No accounts found.");
                    } else {
                        for (Map.Entry<String, Double> entry : accounts.entrySet()) {
                            System.out.println("Account: " + entry.getKey() + " | Balance: " + entry.getValue());
                        }
                    }
                    break;

                case 7:
                    double total = 0;
                    for (double bal : accounts.values()) {
                        total += bal;
                    }
                    System.out.println("Total Bank Balance: " + total);
                    break;

                case 8:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
    

