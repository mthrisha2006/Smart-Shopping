import java.util.ArrayList;

public class ShoppingManager {

    ArrayList<Product> products = new ArrayList<>();

    public void addProduct(int id, String name, double price, int quantity) {

    for (Product p : products) {
        if (p.id == id) {
            System.out.println("Product ID Already Exists");
            return;
        }
    }

    Product p = new Product(id, name, price, quantity);
    products.add(p);

    System.out.println("Product Added Successfully");
}

    public void viewProducts() {

        for (Product p : products) {
            p.display();
        }
    }
}
