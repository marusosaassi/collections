package Examples.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetLookForDuplicatesExample2 {
    public static void main(String[] args) {
        String[] fishes = {"Carp", "Bluegill", "Cobia", "Pumpkinseed", "Salmon", "Bluegill", "Salmon"};

        //register this species in a set, detect the duplicates

        Set<String> unique = new HashSet<>();
        Set<String> duplicated = new HashSet<>();

        for(String fish : fishes) {
            if(!unique.add(fish)) {
                duplicated.add(fish);
            }
        }
        unique.removeAll(duplicated);
        System.out.println("Unique: " + unique );
        System.out.println("Duplicated: " + duplicated);
    }
}
