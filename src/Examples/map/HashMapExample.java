package Examples.map;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, String>  person = new HashMap<>();

        //person.put(null, "1234");  // it does accept null as key
        person.put("name", "Rafael"); //the keys are always unique, we can't have two 'name' keys
        person.put("lastname", "Flores");
        person.put("email", "rafa@gmail.com");
        person.put("age", "26");
        person.put("city", "Mérida");
        person.put("bloodType", "A+");
        person.put("eyesColor", "dark");

        System.out.println("person = " + person);

        String name = person.get("name");
        System.out.println(name);
        String lastname = person.get("lastname");
        System.out.println(lastname);

        //person.clear();
        System.out.println(person.containsKey("email"));
        System.out.println(person.containsValue("Rafael"));
        System.out.println(person.replace("email", "rafa@outlook.com"));
        System.out.println(person);

        //String age = person.remove("age");
        //System.out.println(age);
        boolean b = person.remove("age", "26");
        System.out.println("removed " + b);
        System.out.println(person);

        boolean b2 = person.containsKey("age");
        System.out.println("Contains key 'age' = " + b2);

        boolean b3 = person.containsValue("A+");
        System.out.println("Contains value 'A+' = " + b3);

        System.out.println("--- values ---");
        Collection<String> values = person.values(); //like a set, it is not sorted
        for(String v: values) {
            System.out.println(v);
        }

        System.out.println("--- keys ---");
        Set<String> keys = person.keySet(); // it is not ordered
        for(String k: keys) {
            System.out.println(k);
        }

        System.out.println("--- entrySet ---");
        for(Map.Entry<String, String> e : person.entrySet()) {
            System.out.println(e.getKey() + " => " + e.getValue());
        }

        System.out.println("--- keySet ---");
        for(String key : person.keySet()) {
            String value = person.get(key);
            System.out.println(key + " => " + value);
        }

        System.out.println("--- java8 ---");
        person.forEach((key, value) ->
        {
            System.out.println(key + " = > " + value);
        });

        System.out.println("total: " + person.size());


        person.replace("eyesColor", "brown");
        person.replace("eyesColor", "blue", "green");
        //this returns a boolean, blue doesn't exists so it returns false

        System.out.println(person);

    }
}
