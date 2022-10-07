package Examples.set;

import Examples.model.Student;

import java.util.HashSet;
import java.util.Iterator;
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

        //System.out.println(ss);

        /*System.out.println("Using a classic for");
        //only valid if it is an ArrayList or LinkedList instead of a HashSet
        List <Student> ss = new ArrayList<>();
        for(int i=0; i<ss.size(); i++){
            System.out.println(ss.get(i));
        }*/

        System.out.println("Using for");
        for (Student s: ss) {
            System.out.println(s.getName());
        }

        System.out.println("Using iterator");
        //every collection has an iterator
        Iterator<Student> it = ss.iterator();
        while(it.hasNext()) {
            Student s = it.next();
            System.out.println(s.getName());
        }

        System.out.println("Using stream forEach");
        ss.forEach(s -> System.out.println(s.getName()));

        System.out.println("Using stream forEach2");
        ss.forEach(System.out::println);

    }
}
