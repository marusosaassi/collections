package Examples;

import java.util.*;

public class HashSetAddExample {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("one");
        hs.add("two");
        hs.add("three");
        hs.add("four");
        hs.add("five");
        System.out.println(hs);

        //hs.add("three"); //this element is repeating, it is not added again to the HashSet
        boolean b = hs.add("three");
        System.out.println("does it let duplicated items? = " + b);

        //Collections.sort(hs); // ERROR! Set can't be sorted
        System.out.println(hs);

        //Set<String> s = new HashSet<>();

        List<String> l = new ArrayList<>();
        l.add("one");
        l.add("two");
        l.add("three");
        l.add("four");
        l.add("five");
        System.out.println(l);

        //l.add("three"); //this element is repeating, and it doesn't matter it is still added to the list
        boolean bl = l.add("three");
        System.out.println("does it let duplicated items? = " + bl);
        Collections.sort(l);
        System.out.println(l);

        //from a Set, create an ArrayList:
        List<String> list = new ArrayList<>(hs);
        Collections.sort(list); //this way we can "sort" sets
        System.out.println(list);
    }
}
