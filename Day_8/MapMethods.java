
import java.util.HashMap;

public class MapMethods {

    public static void main(String[] args) {

        HashMap<Integer, Product> hm = new HashMap<Integer, Product>();

        hm.put(1, new Product(1, "apple", 30));

        hm.put(2, new Product(2, "mango", 45));

        hm.put(3, new Product(3, "banana", 40));

        hm.putIfAbsent(3, new Product(3, "banana", 40));

        hm.putIfAbsent(4, new Product(4, "grape", 55));

        System.out.println(hm.get(3));

        System.out.println("elements are :" + hm);

        System.out.println("size is:" + hm.size());

    }

}
