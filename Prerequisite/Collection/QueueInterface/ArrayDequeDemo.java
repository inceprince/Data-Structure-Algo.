package Collection.QueueInterface;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {

        // Create an ArrayDeque of Integer
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // Add elements to the tail
        deque.add(10);            // same as addLast
        deque.addLast(20);
        deque.offerLast(30);      // same as offer

        // Add elements to the head
        deque.addFirst(5);
        deque.offerFirst(1);

        System.out.println("ArrayDeque after additions: " + deque);

        // Peek elements
        System.out.println("Peek First: " + deque.peekFirst());
        System.out.println("Peek Last: " + deque.peekLast());

        // Remove elements
        System.out.println("Removed First: " + deque.removeFirst());
        System.out.println("Removed Last: " + deque.removeLast());

        System.out.println("ArrayDeque after removals: " + deque);

        // Stack operations (LIFO behavior)
        deque.push(100);  // same as addFirst
        System.out.println("After push(100): " + deque);
        System.out.println("Pop(): " + deque.pop());  // same as removeFirst

        System.out.println("Final Deque: " + deque);
    }
}
