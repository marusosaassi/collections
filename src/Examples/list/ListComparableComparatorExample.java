package Examples.list;

import Examples.model.Student;

import java.util.*;

public class ListComparableComparatorExample {
    public static void main(String[] args) {
        List<Student> ss = new ArrayList<>();
        //this list takes the order of the elements

        ss.add(new Student("Maru", 10));
        ss.add(new Student("Rafael", 9));
        ss.add(new Student("Lucy", 4));
        ss.add(new Student("Abe", 3));
        ss.add(new Student("Damian", 8));
        ss.add(new Student("Damian", 7));

        //Collections.sort(ss); //will apply the method in the compare two

        //Collections.sort(ss, (a,b) -> a.getName().compareTo(b.getName()));

        //ss.sort((a,b) -> a.getName().compareTo(b.getName()));

        //ss.sort(Comparator.comparing((Student s) -> s.getName()));
        //ss.sort(Comparator.comparing((Student s) -> s.getName()).reversed());
        ss.sort(Comparator.comparing((Student s) -> s.getGrade()).reversed());
        ss.sort(Comparator.comparing((Student::getGrade)).reversed());
        System.out.println(ss);

        //System.out.println("Using stream forEach");
        //ss.forEach(System.out::println);

    }
}
