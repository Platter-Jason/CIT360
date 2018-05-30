package Collections;

import java.util.*;

public class ArrayListExample {

    public static void main(String[] args) {
        //Happy path - arraylist
        List carArrayList = new ArrayList();
        carArrayList.add("DB9");
        carArrayList.add("Saleen S7");
        carArrayList.add("Ford GT");
        System.out.println(" ArrayList Elements: ");
        System.out.println(carArrayList);
        System.out.println(); //print a blank line

        //Happy Path adding an element into the list as #1 or place 0 in the array
        carArrayList.add(0,"Huracan");
        System.out.println(carArrayList);
        System.out.println(); //print a blank line

        try
        {
            //Nasty add at index 10 which is higher then the array goes.
            carArrayList.add(10,"Ferrari 488");
            System.out.println(carArrayList);
            System.out.println();
        }
        catch(IndexOutOfBoundsException ex)
        {
            System.out.println("IndexOutOfBoundsException Caught continue code");
            System.out.println();
        }

        try
        {
            //Nasty add at index -5  which is below the index of the array
            carArrayList.add(-5,"Ferrari 488");
            System.out.println(carArrayList);
            System.out.println();
        }
        catch(IndexOutOfBoundsException ex)
        {
            System.out.println("IndexOutOfBoundsException Caught continue code");
            System.out.println();
        }

        carArrayList.clear();

        //Nasty Path added a empty string
        carArrayList.add("McClaran F1");
        carArrayList.add("");
        carArrayList.add("918 Sypder");
        System.out.println(" ArrayList Elements: ");
        System.out.println(carArrayList);
        System.out.println(); //print a blank line

        //Nasty Path add a null into the place 3
        carArrayList.add(3, null);
        System.out.println(carArrayList);
        System.out.println(); //print a blank line

        //Happy Path print out the object in 0
        System.out.println(carArrayList.get(0));

        //Nasty Path print out the object in 3 which is a null
        System.out.println(carArrayList.get(3));

        //Nasty Path print out the position of the empty string
        System.out.println(carArrayList.indexOf(""));

        //Nasty Path print out the position of something not in the list
        System.out.println(carArrayList.indexOf("Hi"));

        //Happy Path Add in another DB9
        carArrayList.add(2, "DB9");
        carArrayList.add("DB9");

        System.out.println(carArrayList);
        System.out.println(); //print a blank line

        //Happy Path Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
        System.out.println(carArrayList.lastIndexOf("DB9"));

        //Happy Path Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
        System.out.println(carArrayList.indexOf("DB9"));
        System.out.println();

        //Nasty Path uses the lastIndexOf and indexOf on an object that doesn't exist
        System.out.println(carArrayList.indexOf("Spyker C8"));

        System.out.println(carArrayList.lastIndexOf("-5"));
        System.out.println();

        //Happy Path remove the first instance of an object
        carArrayList.remove("DB9");
        System.out.println(carArrayList);

        //Happy Path remove the object at the index location
        System.out.println(carArrayList.remove(1));
        System.out.println(carArrayList);
        System.out.println();

        try
        {
            //Nasty Path remove the object at the index location which doesn't exist
            System.out.println(carArrayList.remove(7));
            System.out.println(carArrayList);
        }
        catch(IndexOutOfBoundsException ex)
        {
            System.out.println("IndexOutOfBoundsException Caught continue code");
            System.out.println();
        }

        //Happy Path remove everything from the array list
        System.out.println("Array will be emptied");
        carArrayList.removeAll(carArrayList);
        System.out.println(carArrayList);
        System.out.println("Done");
    }
}