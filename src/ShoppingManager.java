import java.util.ArrayList;

public class ShoppingManager {

    ArrayList<Product> products = new ArrayList<>();

    public void addProduct(int id, String name, double price, int quantity) {

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
