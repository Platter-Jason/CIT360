package Collections;

import java.util.HashSet;
public class HashSetExample {
    public static void main(String args[]) {
        // HashSet declaration
        HashSet<String> hash_set =
                new HashSet<String>();

        //Happy Path Adding elements to the HashSet
        hash_set.add("Roadster");
        hash_set.add("Model S");
        hash_set.add("Model X");
        hash_set.add("Model 3");

        //Displaying HashSet elements
        System.out.println(hash_set);
        System.out.println();

        //Nasty Path adding a null to the HashSet
        hash_set.add(null);
        System.out.println(hash_set);
        System.out.println();

        //Nasty Path trying to add a duplicate object which doesn't work because hashset overwrites duplicates.
        hash_set.add(null);
        hash_set.add("Roadster");
        System.out.println(hash_set);
        System.out.println();

        //Happy Path returns a shallow copy of this HashSet instance: the elements themselves are not cloned.
        System.out.println(hash_set.clone());
        System.out.println();

        //Happy Path returns true if value is in the hashset
        System.out.println(hash_set.contains("Roadster"));
        System.out.println();

        //Nasty Path returns tru because the null exist
        System.out.println(hash_set.contains(null));
        System.out.println();

        //Happy Path returns false because the set is not empty
        System.out.println(hash_set.isEmpty());
        System.out.println();

        //Happy Path create new empty set
        HashSet<String> empty_set =
                new HashSet<String>();

        //Happy Path returns true because the set is empty
        System.out.println(empty_set.isEmpty());
        System.out.println();

        //Happy Path prints the size of the set
        System.out.println(hash_set.size());
        System.out.println();

        //Happy Path remove the Roadster
        hash_set.remove("Roadster");
        System.out.println(hash_set);
        System.out.println(hash_set.size());
        System.out.println();

        //Nasty Path remove something that doesn't exist
        hash_set.remove("Mod 3");
        System.out.println(hash_set);
        System.out.println(hash_set.size());
        System.out.println();

        //Nasty Path remove the null
        hash_set.remove(null);
        System.out.println(hash_set);
        System.out.println(hash_set.size());
        System.out.println();

        //Happy Path clears the set
        hash_set.clear();
        System.out.println(hash_set);
        System.out.println(hash_set.size());
    }
}