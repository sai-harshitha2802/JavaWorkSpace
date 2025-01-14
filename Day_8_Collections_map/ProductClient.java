import java.util.HashMap;

public class ProductClient {

    public static void main(String[] args) {

        ProductService productService = new ProductService();

        productService.displayAllProduct();

        System.out.println();

        productService.addProduct(new Product(6, "blanket", "cloth", 5500));

        System.out.println("--after adding--");

        productService.displayAllProduct();

        System.out.println();

        System.out.println("--display only electronic");

        productService.displayOnlyElectronicProduct();

        System.out.println();

        System.out.println("--display product greater than 5000");

        productService.displayProductPriceGreaterThan5000();

        System.out.println();

        //task count of product based on category
        System.out.println("count of category :" + productService.countOfProductByCategory("cloth"));

    }

}
