package day26_Object.people;

import day26_Object.person.PersonClass;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PeopleClass {
    public String groupName;
    public ArrayList<PersonClass> person;

    public PeopleClass(String groupName, List<PersonClass> person){
        this.groupName = groupName;
        this.person = new ArrayList<>(person);
    }

    public ArrayList<PersonClass> search(Predicate<PersonClass> find){
        ArrayList<PersonClass> result = new ArrayList<>();
        for(PersonClass p : person){
            if(find.test(p)){
                result.add(p);
            }
        }
        return result;
    }

}
