package Examples.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, String>  person = new HashMap<>();

        person.put(null, "1234");  // it does accept null as key
        person.put("name", "Rafael"); //the keys are always unique, we can't have two 'name' keys
        person.put("lastname", "Flores");
        person.put("email", "rafa@gmail.com");
        person.put("age", "26");

        System.out.println("person = " + person);

        String name = person.get("name");
        System.out.println(name);
        String lastname = person.get("lastname");
        System.out.println(lastname);


    }
}
