package Examples.set;

import Examples.model.Student;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Student> ll = new LinkedList<>();
        //this list takes the order of the elements

        System.out.println(ll + " size = " + ll.size());
        System.out.println(ll + " está vacía? = " + ll.isEmpty());

        ll.add(new Student("Maru", 10));
        ll.add(new Student("Rafael", 9));
        ll.add(new Student("Lucy", 4));
        ll.add(new Student("Abe", 3));
        ll.add(new Student("Damian", null));

        System.out.println(ll + " size = " + ll.size());

        ll.addFirst(new Student("Zeus", 5));
        ll.addLast(new Student("Atenea", 7));

        System.out.println(ll + " size = " + ll.size());

        System.out.println("First = " + ll.getFirst());
        System.out.println("Last = " + ll.getLast());
        System.out.println("Second index " + ll.get(2));
        System.out.println("First = " + ll.peekFirst()); //doesn't throw exception if the element doesn't exist
        System.out.println("Last = " + ll.peekLast());

        Student zeus = ll.removeFirst(); // we can use this zeus but won't exist on the list
        ll.pollLast(); //also removes but won't throw Exception if the list is empty, just a null value
        System.out.println(ll + " size = " + ll.size());
        System.out.println(zeus);

        //ll.pop();// Removes and returns the first element of this list. This method is equivalent to removeFirst().

        ll.remove(new Student("Maru", 10));


        Student s = new Student("Jihyo", 10);
        ll.addLast(s);

        System.out.println(ll + " size = " + ll.size());

        System.out.println("Jihyo's index = " + ll.indexOf(s));

        //ll.remove(1);

        ll.set(1, new Student("Dahyun", 1));
        System.out.println(ll + " size = " + ll.size());


        ListIterator<Student> li = ll.listIterator();

        System.out.println("-- Next --");

        while(li.hasNext()){
            System.out.println(li.next());
        }


        System.out.println("-- Previous -- ");

        while(li.hasPrevious()) {
            Student student = li.previous();
            System.out.println(student);
        }


    }
}
