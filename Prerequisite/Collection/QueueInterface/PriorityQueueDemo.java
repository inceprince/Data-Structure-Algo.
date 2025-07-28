package Collection.QueueInterface;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {

        // Create a PriorityQueue of Integer (Min-Heap by default)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements
        // add() → throws an exception if insertion fails (rare for PriorityQueue)
        pq.add(1);
        pq.add(2);
        pq.add(3);

        // offer() → returns false instead of exception on failure
        pq.offer(3); // Duplicates are allowed

        // Print the PriorityQueue
        // Note: Order in output is not sorted; internal structure is a min-heap
        System.out.println("PriorityQueue (Min-Heap): " + pq);

        // Accessing the head element:
        // peek() → retrieves head without removing; returns null if empty
        // element() → retrieves head; throws NoSuchElementException if empty
        System.out.println("Head using peek(): " + pq.peek());
        System.out.println("Head using element(): " + pq.element());

        // Removing the head element:
        // poll() → removes and returns head; returns null if empty
        System.out.println("Removed head using poll(): " + pq.poll());
        // Queue after removing head
        System.out.println("PriorityQueue after poll(): " + pq);
        // remove()-> removes and returns head; returns exception if empty
        System.out.println(pq.remove());
        System.out.println("PriorityQueue after remove(): " + pq);

        //Read
        System.out.println("");
        Iterator<Integer> it=pq.iterator();
        while(it.hasNext()){
            System.out.println(it.next());   
        }


    }
}
