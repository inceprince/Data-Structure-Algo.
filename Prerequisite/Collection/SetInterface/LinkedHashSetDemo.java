package Collection.SetInterface;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        // Create a LinkedHashSet of Strings
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        // add(): Adds elements (duplicates are ignored)
        lhs.add("Apple");
        lhs.add("Banana");
        lhs.add("Mango");
        lhs.add("Grapes");
        lhs.add("Apple");  // Duplicate will be ignored
        lhs.add(null);     // One null is allowed

        // Print the LinkedHashSet
        System.out.println("LinkedHashSet Elements: " + lhs);
        // Output: [Apple, Banana, Mango, Grapes, null]

        // contains(): Check if element exists
        System.out.println("Contains 'Mango'? " + lhs.contains("Mango")); // true
        System.out.println("Contains 'Orange'? " + lhs.contains("Orange")); // false

        // remove(): Remove a specific element
        lhs.remove("Grapes");
        System.out.println("After removing 'Grapes': " + lhs);

        // size(): Get the number of elements
        System.out.println("Size of LinkedHashSet: " + lhs.size());

        // isEmpty(): Check if set is empty
        System.out.println("Is set empty? " + lhs.isEmpty());

        // Iterating using for-each loop
        System.out.println("\nUsing for-each loop:");
        for (String fruit : lhs) {
            System.out.println(fruit);
        }

        // Iterating using Iterator
        System.out.println("\nUsing Iterator:");
        Iterator<String> iterator = lhs.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // clear(): Removes all elements
        lhs.clear();
        System.out.println("\nAfter clear(): " + lhs); // Output: []
    }
}
