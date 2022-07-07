package dsa_assignment_07;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 *
 * @author 1999k
 */
public class javaUtilPriorityQueue {

    public static void main(String[] args) {

        // Creating empty priority queue
        System.out.println("Priority Queue for Integer...");
        System.out.println("");
        PriorityQueue<Integer> pQ1 = new PriorityQueue<Integer>();

        // Adding items to the pQ1 using add()
        pQ1.add(10);
        pQ1.add(20);
        pQ1.add(15);

        // Printing the top element of PriorityQueue
        System.out.println("This is the peek element : " + pQ1.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println("This is the poll element : " + pQ1.poll());

        // Printing the top element again
        System.out.println("This is the peek element : " + pQ1.peek());

        System.out.println("");
        System.out.println("Priority Queue for String...");
        System.out.println("");
        PriorityQueue<String> pQ2 = new PriorityQueue<>();

        pQ2.add("Saman");
        pQ2.add("Kamal");
        pQ2.add("Nimal");

        System.out.println("After adding elements : " + pQ2);

        pQ2.remove("Kamal");

        System.out.println("After Remove - " + pQ2);

        System.out.println("Poll Method - " + pQ2.poll());

        pQ2.add("Sunil");

        System.out.println("Final PriorityQueue - " + pQ2);

        // Using the peek() method
        String element = pQ2.peek();
        System.out.println("Accessed Element: " + element);

        System.out.println("");
        System.out.println("Priority Queue Iteration");
        //iteration priority queue
        Iterator iterator = pQ2.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " , ");
        }
        System.out.println("");

    }

}
