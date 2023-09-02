package day26_Object.person;

import java.time.LocalDate;
import java.util.Scanner;

public class PersonClass {
    public String name;
    public int age;
    public LocalDate dob;

   public PersonClass(String name, LocalDate dob){
       this.name = name;
       this.dob = dob;
       age = LocalDate.now().getYear()-dob.getYear();
   }
   Scanner in = new Scanner(System.in);

    @Override
    public String toString() {
        return  name + "{age=" + age +
                ", dob=" + dob +
                '}';
    }

    public void conversation(){
       System.out.println("Would you ask me a question?");
       String ans = in.nextLine();

       while(ans.toLowerCase().trim().equals("yes")){
           System.out.println("Hello, how can I help you");
           String answer = in.nextLine();
           if(answer.toLowerCase().startsWith("h")){
               System.out.println("Why are you asking me this?");
           } else System.out.println("You should know this. Shame on you");
           System.out.println("Would you like to ask another question?");
           ans = in.nextLine();
       }





   }
}
