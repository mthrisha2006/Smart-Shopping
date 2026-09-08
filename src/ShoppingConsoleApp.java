import java.util.Scanner;

public class ShoppingConsoleApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ShoppingManager manager = new ShoppingManager();

        while (true) {

            System.out.println("\n--- Smart Shopping Management ---");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Enter Product ID: ");
                int id = sc.nextInt();

                System.out.print("Enter Product Name: ");
                String name = sc.next();

                System.out.print("Enter Price: ");
                double price = sc.nextDouble();

                System.out.print("Enter Quantity: ");
                int quantity = sc.nextInt();

                manager.addProduct(id, name, price, quantity);

            } else if (choice == 2) {

                manager.viewProducts();

            } else if (choice == 3) {

                System.out.println("Thank You!");
                break;

            } else {

                System.out.println("Invalid Choice");
            }
        }

        sc.close();
    }
}
