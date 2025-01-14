import java.util.HashMap;

import java.util.Map;

public class ProductService {

    HashMap<Integer, Product> hm = new HashMap<Integer, Product>();

    public ProductService() {

        hm.put(1, new Product(1, "laptop", "electronics", 55000));

        hm.put(2, new Product(2, "mouse", "electronics", 1500));

        hm.put(3, new Product(3, "t-shirt", "cloth", 1300));

        hm.put(4, new Product(4, "jacket", "cloth", 4000));

        hm.put(5, new Product(5, "car", "toy", 1200));

    }

    public void addProduct(Product products) {

        hm.put(products.getId(), products);

    }

    public void displayAllProduct() {

        for (Map.Entry<Integer, Product> h : hm.entrySet()) {

            System.out.println(h);

        }

    }

    public void displayOnlyElectronicProduct() {

        for (Map.Entry<Integer, Product> h : hm.entrySet()) {

            if (h.getValue().getCategory().equalsIgnoreCase("electronics")) {

                System.out.println(h);

            }

        }

    }

    public void displayProductPriceGreaterThan5000() {

        for (Map.Entry<Integer, Product> h : hm.entrySet()) {

            if (h.getValue().getPrice() > 5000) {

                System.out.println(h);

            }

        }

    }

    public int countOfProductByCategory(String category) {

        int count = 0;

        for (Map.Entry<Integer, Product> p : hm.entrySet()) {

            if (p.getValue().getCategory().equalsIgnoreCase(category)) {

                ++count;

            }

        }

        return count;

    }

}
