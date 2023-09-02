package day26_Object.constructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConstructorTypes {
    public String name;
    public int age;
    public LocalDate dob;
    public ConstructorTypes(){} // default "empty" constructor allows to create an object without any arguments.
    public ConstructorTypes(String name){ // this constructor allows to create an object by passing name as an arg.
        this.name = name;
    }
    public ConstructorTypes(String name, LocalDate dob){ // this constructor sets up name, dob and age using previous constructor
        this(name);
        this.dob = dob;
        age = LocalDate.now().getYear() - dob.getYear();
    }
    public ConstructorTypes(LocalDate dob){ // this constructor allows to create an object by providing only dob.
        age = LocalDate.now().getYear() - dob.getYear();
    }
// the block below initiates instance variables to a default values that will be overwritten by constructor or manually by user.
    {name = "John Doe";
        dob = LocalDate.now();
        age = 0;
    }


        DateTimeFormatter df = DateTimeFormatter.ofPattern("MM/dd/y, eeee");



    public String toString(){
        return "Person's name: " + name + "\n" +
                "age: " + age + ", DOB: " + df.format(dob) + "\n";

    }
}
