
import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();

        stack.add(1);

        stack.push(1);

        stack.push(2);

        System.out.println("elements are:" + stack);

        System.out.println("find the top elements:" + stack.peek());

        System.out.println("it will remove the elements and return it:" + stack.pop());

        System.out.println("elements are:" + stack);

        System.out.println("it will remove the elements and return it:" + stack.pop());

        System.out.println("elements are:" + stack);

    }

}
