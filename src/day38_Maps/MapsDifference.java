package day38_Maps;

import java.util.*;

public class MapsDifference {
    public static void main(String[] args) {
        Map<String, String> person = new HashMap<>(); // random order, accepts null key values
        person.put("Name", "Danil");
        person.put("Age", "32");
        person.put("Job Title", "SDET");
        person.put("Address", "6618 Eich Dr");
        person.put(null, null);

        System.out.println("Hash map: " +person);

        Map<String, String> person2 = new LinkedHashMap<>(); // insertion order, accepts null key values
        person2.put("Name", "Danil");
        person2.put("Age", "32");
        person2.put("Job Title", "SDET");
        person2.put("Address", "6618 Eich Dr");
        person2.put(null, null);

        System.out.println("Linked map: " +person2);


        Map<String, String> person3 = new TreeMap<>(); // ascending key order, does not accept null key values
        person3.put("Name", "Danil");
        person3.put("Age", "32");
        person3.put("Job Title", "SDET");
        person3.put("Address", "6618 Eich Dr");
        //person3.put(null, null);
        System.out.println("Tree map: " + person3);


        Map<String, String> person4 = new Hashtable<>(); // random order, does not accept null key values or null values, synchronized
        person4.put("Name", "Danil");
        person4.put("Age", "32");
        person4.put("Job Title", "SDET");
        person4.put("Address", "6618 Eich Dr");
        //person4.put(null, null);

        System.out.println("Hashtable: " +person4);
    }
}
