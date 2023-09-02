package day26_Object.people;

import day26_Object.person.PersonClass;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class PeopleObject {
    public static ArrayList<PersonClass> search(ArrayList<PersonClass> list, Predicate<PersonClass> find){
        ArrayList<PersonClass> result = new ArrayList<>();
        for(PersonClass person : list   ){
            if(find.test(person)){
                result.add(person);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        PeopleClass workers = new PeopleClass("Workers", Arrays.asList(
                new PersonClass("Mike", LocalDate.of(1985, 5, 21)),
                new PersonClass("Vikki", LocalDate.of(1997, 8, 30)),
                new PersonClass("Smitty", LocalDate.of(1955, 4, 13)),
                new PersonClass("Misha", LocalDate.of(1973, 1, 21)),
                new PersonClass("Vika", LocalDate.of(1990, 11, 30)),
                new PersonClass("Stas", LocalDate.of(2005, 12, 13))
        ));

        System.out.println(workers.search(p -> p.name.startsWith("M")));
        System.out.println(search(workers.person, p -> p.age > 30));
        System.out.println(search(workers.person, p -> p.age < 30));
    }
}
