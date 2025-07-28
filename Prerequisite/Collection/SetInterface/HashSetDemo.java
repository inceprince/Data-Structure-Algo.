package Collection.SetInterface;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {

        // HashSet Syntax:
        // new HashSet<>(initialCapacity, loadFactor)
        // - initialCapacity: The number of buckets (default is 16)
        // - loadFactor: The threshold that triggers rehashing (default is 0.75)
        //
        // If the number of elements exceeds (capacity * loadFactor), the HashSet will grow (rehashing).
        // Example: with capacity = 100 and load factor = 0.90 → rehashing happens after 90 elements.

        // Create a HashSet with initial capacity 100 and load factor 0.90
        HashSet<Object> lh = new HashSet<>(100, 0.90f);

        // Add various types of elements to the HashSet
        // Note: HashSet stores only unique elements (duplicates are ignored)
        lh.add(100);
        lh.add("Prince");
        lh.add("Job");
        lh.add(null);     // Only one null is allowed
        lh.add(true);     // Boolean value

        // Print all elements of HashSet
        // Note: Order is not guaranteed (HashSet is unordered)
        System.out.println("HashSet Elements: " + lh);

        // Get the size of HashSet
        System.out.println("The Size of HashSet is: " + lh.size());

        // Try to remove a non-existing element (400)
        lh.remove(400); // No error; just no change
        System.out.println("After attempting to remove 400: " + lh);

        // Check if specific elements exist
        System.out.println("Does HashSet contain 100? " + lh.contains(100));     // true
        System.out.println("Does HashSet contain \"job\"? " + lh.contains("job")); // false (case-sensitive)

        // Check if the HashSet is empty
        System.out.println("Is the HashSet empty? " + lh.isEmpty());

        // Read elements using for-each loop
        System.out.println("\nReading elements using for-each loop:");
        for (Object item : lh) {
            System.out.println(item);
        }

        // Read elements using Iterator
        System.out.println("\nReading elements using Iterator:");
        Iterator<Object> it = lh.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

//Questions
        // New Hashset for integer
        HashSet<Integer> evenNuber=new HashSet<>();
        evenNuber.add(2);
        evenNuber.add(4);
        evenNuber.add(6);
        System.out.println("Hashet: "+evenNuber);

        //Add the evenNumber of elemet into this hashset
        // -->allMethod()
        HashSet<Integer> Number=new HashSet<>();
        Number.addAll(evenNuber);
        Number.add(10);
        System.out.println("New HashSet: "+Number);
        //RemoveAll()
        Number.removeAll(evenNuber);
        System.out.println("After removing eventNumber element:"+Number);

// Questions
        HashSet<Integer> set1=new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(6);
        System.out.println("Hashset 1:"+set1);

        HashSet<Integer> set2=new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println("Hashset 2:"+set2);


        //union(unique elememts in two sets)
        set1.addAll(set2);
        System.out.println("Union"+set1);

        //Intersection(common elemets in both sets)
        set1.retainAll(set2);
         System.out.println("Intersection:"+set1);

         //diffrence
         set1.removeAll(set2);
         System.out.println("Diffrence is:" +set1);







    }
}
