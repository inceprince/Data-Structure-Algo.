package Collection.ListInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Merge {

    public static void main(String[] args) {
        List<Integer> al=new ArrayList<Integer>();
        al.add(3);
        al.add(3);
        al.add(35);
        al.add(5);
        al.add(8);
        al.add(14);
        al.add(33);
        // System.out.println(al);


        List<Integer> al2=new ArrayList<Integer>();
        al2.addAll(al);
        al2.add(45);
        al2.add(50);
        al2.add(89);
        // System.out.println(al2);


       
        


        //Sort
        Collections.sort(al2);
        System.out.println(al2);

        //Sort in descdeing order
        Collections.sort(al2, Collections.reverseOrder());
        System.out.println(al2);



    }
}