package Collection.SetInterface;

import java.util.TreeSet;

public class TreeSetMethodsDemo {
    public static void main(String[] args) {

        // Create a TreeSet of integers (automatically sorted in ascending order)
        TreeSet<Integer> ts = new TreeSet<>();

        // add(): Adds elements to TreeSet (duplicates are ignored)
        ts.add(50);
        ts.add(10);
        ts.add(40);
        ts.add(20);
        ts.add(30);
        ts.add(20); // Duplicate  will not be added

        System.out.println("TreeSet Elements (Sorted): " + ts); // Output: [10, 20, 30, 40, 50]

        // contains(): Checks if an element exists
        System.out.println("Contains 20? " + ts.contains(20)); // true
        System.out.println("Contains 60? " + ts.contains(60)); // false

        // remove(): Removes a specific element
        ts.remove(40);
        System.out.println("After removing 40: " + ts); // Output: [10, 20, 30, 50]

        // size(): Returns number of elements in TreeSet
        System.out.println("Size of TreeSet: " + ts.size()); // 4

        // isEmpty(): Checks if the TreeSet is empty
        System.out.println("Is TreeSet empty? " + ts.isEmpty()); // false

        // first(): Returns the smallest element
        System.out.println("First Element: " + ts.first()); // 10

        // last(): Returns the largest element
        System.out.println("Last Element: " + ts.last()); // 50

        // higher(E): Returns least element strictly greater than given element
        System.out.println("Element higher than 20: " + ts.higher(20)); // 30

        // lower(E): Returns greatest element strictly less than given element
        System.out.println("Element lower than 30: " + ts.lower(30)); // 20

        // ceiling(E): Returns least element greater than or equal to given
        System.out.println("Ceiling of 25: " + ts.ceiling(25)); // 30
        System.out.println("Ceiling of 20: " + ts.ceiling(20)); // 20

        // floor(E): Returns greatest element less than or equal to given
        System.out.println("Floor of 25: " + ts.floor(25)); // 20
        System.out.println("Floor of 20: " + ts.floor(20)); // 20

        // pollFirst(): Removes and returns the first (smallest) element
        System.out.println("pollFirst(): " + ts.pollFirst()); // 10
        System.out.println("After pollFirst: " + ts); // [20, 30, 50]

        // pollLast(): Removes and returns the last (largest) element
        System.out.println("pollLast(): " + ts.pollLast()); // 50
        System.out.println("After pollLast: " + ts); // [20, 30]

        // clear(): Removes all elements from TreeSet
        ts.clear();
        System.out.println("After clearing TreeSet: " + ts); // []
    }
}
