package Examples.set;

import Examples.model.Student;

import java.util.HashSet;
import java.util.Set;

public class HashSetUniquenessExample {
    public static void main(String[] args) {
        Set<Student> ss = new HashSet<>();
        //wil ignore the compare to to use this

        ss.add(new Student("Maru", 10));
        ss.add(new Student("Rafael", 9));
        ss.add(new Student("Lucy", 4));
        ss.add(new Student("Abe", 3));
        ss.add(new Student("Damian", 8));
        ss.add(new Student("Damian", 7));

        System.out.println(ss);


    }
}
