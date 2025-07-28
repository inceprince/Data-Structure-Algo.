package Collection.ListInterface;

import java.util.*;

class DemoArrayList {
    public static void main(String[] args) {
        // same type of data stored-->
        List<Integer> al = new ArrayList<Integer>();

        // diffret data types-->
        // List <Object> al=new ArrayList<>();

        // Adding data into arraylist
        al.add(100);
        al.add(299);
        al.add(300);
        al.add(299);
        al.add(null);
        al.add(null);

        System.out.println(al);
        // size()
        System.out.println("No of elemts in arraylist: " + al.size());

        // remove
        al.remove(1);//here 1 is index
        al.remove(Integer.valueOf(300));//here it is elemet
        // System.out.println("After Removing elemnt from arrayList: "+al);

        // insert a new elemet--> add(index,object);
        al.add(2, 899);//it will be added at index 2 and the index 2 elemnt will be shifted to next index.
        System.out.println("After insertion: " + al);

        // retreive specific elemet
        // it will retrive the elem from index.
        System.out.println(al.get(2));

        // chnage existing value
        al.set(0, 120);
        System.out.println("After relacement ,the Latest List: " + al);

        // Search -contains()--Return true/false
        System.out.println(al.contains(120));
        System.out.println(al.contains(10));

        // isEmpty
        System.out.println(al.isEmpty());

        // Reading of data
        // 1)for loop

        System.out.println("Reading elemt using for loop......");
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

        // 2)for.each loop(enhanced for loop)
        System.out.println("Reading elemt using for.each loop......");
        for (Integer e : al) {
            System.out.println(e);

        }

        // 3)iterator
        System.out.println("Reading elemt using iterator method......");
        Iterator<Integer> it=al.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }

        // copy all the elemet into other arraylist i.e duplicate arraylist using
        // addAll() method
        System.out.println("Another Array list:");
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        al2.addAll(al);//every element is added of al to al2
        System.out.println(al2);

        // Remove all element
        System.out.println("After removing all the element");
        al2.removeAll(al);
        System.out.println(al2);
        
        // Remove null
        al.removeIf(Objects::isNull);//ArrayList<Integer> contains null values, and Collections.sort() cannot compare null with integers. 

        
        

        // sort ---- Collection.sort()(it is from Collection class)

        System.out.println("Element in the array list" + al);
        Collections.sort(al);//collections class having sort method which is is java.util package
        System.out.println("Sorted Element in the array list" + al);

        // reverse
        Collections.sort(al, Collections.reverseOrder());
        System.out.println("Elements in reverse order: " + al);

        // shuffling-- Collections.shuffle()
        Collections.shuffle(al);
        System.out.println("Elements in the arrayList after shuffling: " + al);

        // covert array into arraylist
        String arr[] = { "Dog", "Cat", "Elephant" };
        for (String value : arr) {
            System.out.println(value);
        }
        ArrayList<String> al3 = new ArrayList<String>(Arrays.asList(arr));
        System.out.println(al3);

    }

}