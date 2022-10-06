package Examples;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        // TreeSets have a cost of performance because they are sorted
        Set<String> ts = new TreeSet<>((a,b) -> b.compareTo(a)); //reverse order for the ts set

        ts.add("one");
        ts.add("two");
        ts.add("three");
        ts.add("three");
        ts.add("four");
        ts.add("five");

        System.out.println(ts);
        // set doesn't accept dulplicated elements

        Set<Integer> numbers = new TreeSet<>(Comparator.reverseOrder());
        numbers.add(1);
        numbers.add(5);
        numbers.add(4);
        numbers.add(2);
        numbers.add(3);
        numbers.add(10);
        System.out.println(numbers);

        //restriction: implement Comparable to add elements to a TreeSet



    }
}
