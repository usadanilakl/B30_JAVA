package day32_Abstraction;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public abstract class AbstractParent {
    private String name;
    private String age;
    private String occupation;

    private String str = "";

    public void setName(){
        Scanner in = new Scanner(System.in);
        String name = null;
        while (name == null){
            System.out.println("Type your name: ");
            name = in.nextLine();
            for(int i = 0; i<name.length(); i++){
                if(  !(Character.isLetter(name.charAt(i)) || Character.isSpaceChar(name.charAt(i))) || name.trim().isEmpty()  ){
                    this.name = "";
                    name = null;
                    break;
                } else{
                    this.name = name;
                }
            }

        }
        str += "My name is: " + name + "\n";
    }
    public String getName(){
        return name;
    }

    public void setAge(LocalDate dob){
        if(dob.isAfter(LocalDate.of(1920,1,1))){
            age = Period.between(dob,LocalDate.now()).getYears() + " years, " + Period.between(dob,LocalDate.now()).getMonths() +
                    " months, " + Period.between(dob, LocalDate.now()).getDays() + " days";
        }
        str+= "I am " + age + "old\n";
    }

    public String getAge(){
        return age;
    }

    public void setOccupation(){
        String occupation = "";
        while(!(occupation.toLowerCase().equals("sdet") || occupation.toLowerCase().equals("developer") || occupation.toLowerCase().equals("it"))){
            Scanner in = new Scanner(System.in);
            System.out.println("Type your occupation: ");
            occupation = in.nextLine();
        }
        occupation = occupation.toLowerCase().equals("sdet")? "SDET"
                : occupation.toLowerCase().equals("developer")? "Developer"
                : "IT";
        this.occupation = occupation;
        str+="My occupation is "+ occupation;
    }

    public String getOccupation(){
        return occupation;
    }

    public AbstractParent( LocalDate dob){
        setAge(dob);
        setOccupation();
        setName();
    }

    public abstract void work();
    public abstract void rest();
    public abstract void enjoy();

    public String toString(){
        return str;
    }
}
