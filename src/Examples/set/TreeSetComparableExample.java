package Examples.set;

import Examples.model.Student;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetComparableExample {
    public static void main(String[] args) {
        Set<Student> ss = new TreeSet<>();

        ss.add(new Student("Maru", 10));
        ss.add(new Student("Rafael", 9));
        ss.add(new Student("Lucy", 4));
        ss.add(new Student("Abe", 3));
        ss.add(new Student("Damian", 8));

        System.out.println(ss);


    }
}