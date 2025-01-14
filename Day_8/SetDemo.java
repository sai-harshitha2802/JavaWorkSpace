
import java.util.HashSet;

public class SetDemo {

    public static void main(String[] args) {

        HashSet<Product> products = new HashSet<Product>();

        products.add(new Product(100, "lakshmi shampoo", 450));

        products.add(new Product(101, "body wash", 860));

        products.add(new Product(100, "lakshmi shampoo", 450));

        for (Product product : products) {

            System.out.println(product);

        }

    }

}
