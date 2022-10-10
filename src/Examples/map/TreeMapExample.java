package Examples.map;

import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        //Map<String, Object> person = new TreeMap<>((a,b) -> b.compareTo(a));

        //Map<String, Object> person = new TreeMap<>(Comparator.reverseOrder());
        Map<String, Object> person = new TreeMap<>(Comparator.comparing(String::length).reversed());

        //person.put(null, "1234");  // error NullPointerException, null can't be sorted
        person.put("name", "Rafael");
        person.put("lastname", "Flores");
        person.put("email", "rafa@gmail.com");
        person.put("age", "26");
        person.put("city", "Los Ángeles");
        person.put("bloodType", "A+");
        person.put("eyesColor", "dark");

        Map<String, String> address = new TreeMap<>();
        address.put("country", "United States");
        address.put("state", "California");
        address.put("city", "Los Angeles");
        address.put("street", "Beverly Hills");
        address.put("number", "192");

        person.put("address", address);

        System.out.println(person);

    }
}
