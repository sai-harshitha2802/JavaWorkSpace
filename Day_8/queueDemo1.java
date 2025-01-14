
import java.util.ArrayList;

import java.util.LinkedList;

import java.util.List;

import java.util.Queue;

public class queueDemo1 {

    public static void main(String[] args) {

        //List<String> names = new ArrayList<String>();
        //List<String> names2=new LinkedList<String>();
        Queue<String> names3 = new LinkedList<String>();

        names3.add("a");

        names3.add("b");

        names3.add("c");

        System.out.println("elements of queue:" + names3);

        System.out.println("element to be removed :" + names3.remove());

        System.out.println("after remove:" + names3);

        System.out.println("top element :" + names3.peek());

    }

}
