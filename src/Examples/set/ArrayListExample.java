package Examples.set;

import Examples.model.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Student> al = new ArrayList<>();
        //this list takes the order of the elements

        System.out.println(al + " size = " + al.size());
        System.out.println(al + " está vacía? = " + al.isEmpty());

        al.add(new Student("Maru", 10));
        al.add(new Student("Rafael", 9));
        al.add(new Student("Lucy", 4));
        al.add(0, new Student("Abe", 3)); //we can save the element on a specific position
        al.set(1, new Student("Damian", 8)); // set modifies instead of adding, that way maru disappears


        System.out.println(al + " size = " + al.size());

        al.remove(new Student("Lucy",4)); // we remove by object, we can customize the deletion with equals
        //al.remove(2);
        //System.out.println(al + " size = " + al.size());


        boolean b = al.contains(new Student("Lucy", 4));
        System.out.println("The list contains Lucy = " + b);

        Object a[] = al.toArray();
        for(int i =0; i<a.length; i++) {
            System.out.println("Desde el arreglo = " + a[i]);
        }

    }
}
