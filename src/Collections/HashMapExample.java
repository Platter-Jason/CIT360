package Collections;

import java.util.HashMap;


public class HashMapExample {

    public static void main(String[] args) {

        HashMap cars = new HashMap();

        // Happy Path Add some cars.
        cars.put("Aventador", 1964);
        cars.put("LaFerrari", 1965);
        cars.put("Veneno", 1969);
        cars.put("Hennessey Venom GT", 1969);

        System.out.println("Total cars: " + cars.size());

        // Happy Path Print out a list of the cars and their values
        for(Object key: cars.keySet())
            System.out.println(key + " - " + cars.get(key));
        System.out.println();

        //Print out the car year.
        System.out.println("The Aventador is a "
                + cars.get("Aventador") + "\n");

        // Clear all values.
        cars.clear();

        //Nasty Path add in a car with with a null year and string values
        cars.put("Veyron", "2000");
        cars.put("Agera R", "1993");
        cars.put("9ff GT9-R", null);

        for(Object key: cars.keySet())
            System.out.println(key + " - " + cars.get(key));
        System.out.println();

        System.out.println("The 9ff GT9-R is a "
                + cars.get("9ff GT9-R") + "\n");

        // Clear all values.
        cars.clear();

        //Nasty Path add in a null car with with a year
        cars.put("Skyline", 1985);
        cars.put("SSC Ultimate Aero", 1995);
        cars.put(null, 1954);

        for(Object key: cars.keySet())
            System.out.println(key + " - " + cars.get(key));
        System.out.println();

        System.out.println("The null is a "
                + cars.get(null) + "\n");

        System.out.println(cars);
        System.out.println();


        //Nasty Path add in a null car and null year this replaces the null car from the last Nasty Path
        cars.put(null, null);

        System.out.println("The null is a "
                + cars.get(null) + "\n");

        System.out.println(cars);
        System.out.println();

        //Nasty Path trys to pull a value from a non existent key
        System.out.println(cars.get("Corvette"));
        System.out.println();

        // Nasty Path this prints my car message multiple times because it runs the print till it runs out cars
        // in the map cause I used a for command where I shouldn't have
        for(Object key: cars.keySet())
            System.out.println("The SSC Ultimate Aero is a "
                    + cars.get("SSC Ultimate Aero") + "\n");

        //Nasty Path adding a empty string value into the map
        cars.put("Mustang", "");
        System.out.println(cars);
        System.out.println();


        //Happy path print true if the Value and the Key are in the Map
        // it will print false for the Agera R since it has been cleared
        System.out.println(cars.containsKey("Agera R"));
        System.out.println();

        //Prints true since it finds the value
        System.out.println(cars.containsValue(1985));
        System.out.println();

        //Nasty Path prints true because it does find a null in the hashmap
        System.out.println(cars.containsKey(null));
        System.out.println();

        // Print the size of the hash map
        System.out.println("The Hash Map has " + cars.size() + " cars");
        System.out.println();

        //Happy Path remove a key value
        cars.remove("SSC Ultimate Aero");
        System.out.println("SSC Ultimate Aero has been removed");
        System.out.println();

        // Print the size of the hash map
        System.out.println("The Hash Map has " + cars.size() + " cars");
        System.out.println();

        //Nasty Path remove a key value that doesn't exist
        cars.remove("Agera R");
        System.out.println("Agera R was not removed!");
        System.out.println();

        // Print the size of the hash map
        System.out.println("The Hash Map has " + cars.size() + " cars");
        System.out.println();

        // Nasty Path removes the null
        cars.remove(null);
        System.out.println("Null has been removed");
        System.out.println();

        // Print the size of the hash map
        System.out.println("The Hash Map has " + cars.size() + " cars");
        System.out.println();
    }
}