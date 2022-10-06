package Examples.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetLookForDuplicatesExample {
    public static void main(String[] args) {
        String[] fishes = {"Carp", "Bluegill", "Cobia", "Pumpkinseed", "Salmon", "Bluegill", "Salmon"};

        //register this species in a set, detect the duplicates

        Set<String> unique = new HashSet<>();

        for(String fish : fishes) {
            if(!unique.add(fish)) {
                System.out.println("Duplicated element: " + fish);
            }
        }
        System.out.println(unique.size() + " not duplicated: " + unique);
    }
}
