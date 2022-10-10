package Examples.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapWithObjectsExample {
    public static void main(String[] args) {
        Map<String, Object>  person = new HashMap<>();

        //person.put(null, "1234");  // it does accept null as key
        person.put("name", "Rafael"); //the keys are always unique, we can't have two 'name' keys
        person.put("lastname", "Flores");
        person.put("email", "rafa@gmail.com");
        person.put("age", "26");
        person.put("city", "Los Ángeles");
        person.put("bloodType", "A+");
        person.put("eyesColor", "dark");

        Map<String, String> address = new HashMap<>();
        address.put("country", "United States");
        address.put("state", "California");
        address.put("city", "Los Angeles");
        address.put("street", "Beverly Hills");
        address.put("number", "192");

        person.put("address", address);

        System.out.println("person = " + person);

        String name = (String) person.get("name");
        System.out.println(name);
        String lastname = (String) person.get("lastname");
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
        Collection<Object> values = person.values(); //like a set, it is not sorted
        for(Object v: values) {
            System.out.println(v);
        }

        System.out.println("--- keys ---");
        Set<String> keys = person.keySet(); // it is not ordered
        for(String k: keys) {
            System.out.println(k);
        }

        System.out.println("--- entrySet ---");
        for(Map.Entry<String, Object> e : person.entrySet()) {
            System.out.println(e.getKey() + " => " + e.getValue());
        }

        System.out.println("--- keySet ---");
        for(String key : person.keySet()) {
            Object value = person.get(key);
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
        //this returns a boolean, blue doesn't exist, so it returns false

        System.out.println(person);

        Map<String, String> personAddress = (Map<String, String>) person.get("address");
        String country = personAddress.get("country");
        String city = personAddress.get("city");
        String zipCode = personAddress.getOrDefault("zipCode", null);

        System.out.println(name + "'s country = " + country);
        System.out.println(name + "'s city = " + city);
        System.out.println(name + "'s ZIP code = " + zipCode);

    }
}
