
import java.util.HashMap;

import java.util.Map;

import java.util.Map.Entry;

public class MapIterateDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(1, "sachin");

        hm.put(2, "mahesh");

        hm.put(1, "rahul");

        hm.put(3, "ankit");

        hm.put(4, "mahesh");

        System.out.println("key set :" + hm.keySet());

        System.out.println("values :" + hm.values());

        System.out.println("entry set:" + hm.entrySet());

        System.out.println();

        System.out.println("---------------");

        System.out.println("iterate key");

        for (Integer key : hm.keySet()) {
            System.out.println(key);
        }

        System.out.println("iterate value");

        for (String value : hm.values()) {
            System.out.println(value);
        }

        System.out.println("iterate key with value");

        for (Integer key : hm.keySet()) {
            System.out.println("Key :" + key + " value :" + hm.get(key));
        }

        System.out.println("----iterate entry set----");

        for (Map.Entry<Integer, String> h : hm.entrySet()) {

            System.out.println(h);

        }

    }

}
