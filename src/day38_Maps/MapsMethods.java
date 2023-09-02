package day38_Maps;

import java.util.*;

public class MapsMethods {
    public static void main(String[] args) {
        Map<String, String> person2 = new LinkedHashMap<>(); // insertion order, accepts null key values
        person2.put("Name", "Danil");
        person2.put("Age", "32");
        person2.put("Job Title", "SDET");
        person2.put("Address", "6618 Eich Dr");
        person2.put(null, null);

        person2.put("Age", "Young"); // this updates the value of "Age"
        person2.replace("Age", "32.6"); // this updates value of "Age" but faster
        System.out.println("person2.get(\"Age\") = " + person2.get("Age"));
        person2.size(); //5
        person2.remove(null); //removes key and value from the map
        person2.containsKey("Age"); // true
        person2.containsValue("32.6"); // true
        person2.compute("Age", (k,v)-> String.valueOf(Double.valueOf(v)>32.5 ? 33 : 32));
        System.out.println("person2.get(\"Age\") = " + person2.get("Age"));
        Set<String> keys = person2.keySet();
        System.out.println("keys = " + keys);
        Collection<String> values = person2.values();
        System.out.println("values = " + values);
        Set<Map.Entry<String,String>> setEntries = person2.entrySet();

        System.out.println("setEntries = " + setEntries);

        System.out.println("new List<>(setEntries).get(0) = " + new ArrayList<>(setEntries).get(0));
        System.out.println("new ArrayList<>(setEntries).get(2).getKey() = " + new ArrayList<>(setEntries).get(2).getKey());


    }
}
