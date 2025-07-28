package Collection.ListInterface;

import java.util.*;

public class DemoLinkedList {
    // linkedlist can be used when we want to insert or delete
    public static void main(String[] args) {
        // LinkedList<Integer> list=new LinkedList<Integer>();
        LinkedList<Object> list = new LinkedList<Object>();// diffrent data types

        // Add elemts into linked list
        list.add("Welcome");
        list.add(15.5);
        list.add('A');
        list.add(true);
        list.add(null);
        System.out.println(list); // [Welcome, 15.5, A, true, null]
        // Size
        System.out.println(list.size());
        // remove
        list.remove(3); // index passing
        System.out.println("After removing list:" + list);

        // Insert/adding elemt in the middle of linkedlist
        list.add(3, "Java");
        System.out.println("After inserting elemt th new list is: " + list);
        // retriving the value
        System.out.println(list.get(0));

        // replace
        list.set(2, "Apple");
        System.out.println("New List: " + list);

        // contains()

        System.out.println(list.contains("Java"));
        System.out.println(list.contains("JS"));

        // isEmpty
        System.out.println(list.isEmpty());

    }
}
