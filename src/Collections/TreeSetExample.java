package Collections;

import java.util.*;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String args[]) {
        // Create a tree set
        TreeSet cars = new TreeSet();
        // Add elements to the tree set
        cars.add("Volante");
        cars.add("Testerossa");
        cars.add("528i");
        cars.add("Corvette Stingray");
        cars.add("Austin Healey 3000 ");
        cars.add("Elise");
        cars.add("Daytona 500");
        System.out.println(cars);
        System.out.println();

        //Nasty Path add a null into the tree set which causes a null pointer exception
        try
        {
            System.out.println(cars.add(null));
            System.out.println(cars);
        }
        catch(NullPointerException e)
        {
            System.out.println("Null Pointer Exception Caught continue code");
            System.out.println();
        }

        //Nasty Path add a 1 into the tree set.
        cars.add("1");
        System.out.println(cars);
        System.out.println();

        //Happy Path print the tree set in reverse order
        System.out.println(cars.descendingSet());
        System.out.println();

        //Happy Path print the object that is higher in the tree set then the object listed.
        System.out.println(cars.higher("Corvette Stingray"));
        System.out.println();

        //descendingset and the higher together will that work?

        try
        {
            //Nasty null into .higher
            System.out.println(cars.higher(null));
            System.out.println();
        }
        catch(NullPointerException e) {
            System.out.println("Null Pointer Exception Caught continue code");
            System.out.println();
        }


        //Nasty Path print the object that is higher in the tree set then the object listed
        // which is null because the object is already the highest.
        System.out.println(cars.higher("Daytona 500"));
        System.out.println();

        //Nasty Path print the object that is higher in the tree set then the object listed
        // empty string is lower then anything on the list so it shows the first object.
        System.out.println(cars.higher(""));
        System.out.println();

        cars.add("-");
        System.out.println(cars);
        System.out.println();

        //Happy Path print the first thing in the list which is the -
        System.out.println(cars.first());
        System.out.println();

        //Happy Path find the first object in the set and remove it
        System.out.println(cars.pollFirst());
        System.out.println();
        System.out.println(cars);
        System.out.println();

        //Happy Path find the last object in the set and remove it
        System.out.println(cars.pollLast());
        System.out.println();
        System.out.println(cars);
        System.out.println();

        //Nasty Path create a new empty tree set to test pollLast and pollFirst on
        TreeSet emptycars = new TreeSet();
        System.out.println(emptycars.pollLast());
        System.out.println();
        System.out.println(emptycars.pollFirst());
        System.out.println();

        //Happy Path print the object and everything in the tree after the value
        System.out.println(cars.tailSet("528i"));
        System.out.println();

        System.out.println(cars.size());
        System.out.println();

        //Happy Path
        cars.remove("Volante");
        System.out.println(cars);
        System.out.println();
        System.out.println(cars.size());
        System.out.println();

        //Nasty Path remove something that is not there
        cars.remove("5");
        System.out.println(cars.size());
        System.out.println();

        //Happy Path remove everthing from the tree
        cars.clear();
        System.out.println(cars);
        System.out.println(cars.size());
        System.out.println();

        //intersection and union
        Set<Integer> a = new TreeSet<Integer>(Arrays.asList(new Integer[]{1,3,8,9,10}));
        Set<Integer> b = new TreeSet<Integer>(Arrays.asList(new Integer[]{3,5,6,8,9,11}));

        //union
        Set<Integer> c = new TreeSet<Integer>(a);
        c.addAll(b);
        System.out.println(c);

        //intersection
        Set<Integer> d = new TreeSet<Integer>(a);
        d.retainAll(b);
        System.out.println(d);

        //difference
        Set<Integer> e = new TreeSet<Integer>(a);
        e.removeAll(b);
        System.out.println(e);

//reverse
        List<Integer> list = new ArrayList<Integer>(a);
        java.util.Collections.reverse(list);
        System.out.println(list);


    }
}