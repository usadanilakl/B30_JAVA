package day38_Maps;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class MapIteration {
    public static void main(String[] args) {
        Map<String, String> person2 = new LinkedHashMap<>(); // insertion order, accepts null key values
        person2.put("Name", "Danil");
        person2.put("Age", "32");
        person2.put("Job Title", "SDET");
        person2.put("Address", "6618 Eich Dr");

        for(String v : person2.values()){ // Iterating using map values
            System.out.println(v);
        }
        System.out.println("------------------------------------------");
        for(String k : person2.keySet()){ // Iterating using map keys
            System.out.println(k);
        }
        System.out.println("--------------------------------------------");
        for(Map.Entry e : person2.entrySet()){ // Iterating using map entries
            System.out.println(e);
        }
        System.out.println("-----------------------------------------------");

        Map<String, Object> person = new LinkedHashMap<>(); // insertion order, accepts null key values
        person.put("Name", "Danil");
        person.put("Age", 32);
        person.put("Job Title", "SDET");
        person.put("Address", "6618 Eich Dr");
        person.put("phone", 2247047307L);
        person.put("DOB", LocalDate.of(1991,1,17));

        for(Map.Entry e : person.entrySet()){
            if(e.getKey().equals("Age")){
               e.setValue(  (Integer)e.getValue()+0.5  );
            }
        }
        System.out.println("person.get(\"Age\") = " + person.get("Age"));


    }
}
