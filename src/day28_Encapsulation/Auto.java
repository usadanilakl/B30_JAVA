package day28_Encapsulation;

import java.time.LocalDate;

public class Auto {
    private String make, model;
    private LocalDate year;
    private int age;
    
    public void setMake(String make){
        if(make.toLowerCase().equals("ram") || make.toLowerCase().equals("chevrolet") || make.toLowerCase().equals("toyota") )
        this.make = make;
        else System.err.println("Invalid make");
    }
    public String getMake(){
        if(make==null) return "Make wasn't set yet";
        else return make;
    }

    public void setModel(String model){
        if(model.toLowerCase().equals("big horn") || model.toLowerCase().equals("laramy") || model.toLowerCase().equals("limited") )
            this.model = model;
        else System.err.println("Invalid model");
    }
    public String getModel(){
        if(model==null) return "model wasn't set yet";
        else return model;
    }
    
    public void setYear(LocalDate year){
        if(year.isBefore(LocalDate.of(2010,1,1))) System.err.println("Too old");
        else {
            this.year = year;
            age = LocalDate.now().getYear()-year.getYear();
        }
    }
    
    public LocalDate getYear(){
        if(year==null){
            System.out.println("year wasn't set");
            return null;
        } else{
            return year;
        }
    }
    public int getAge(){
        if(age!=0) return age;
        else {
            System.out.println("can'not calculate the age, year wasn't set yet");
            return 0;
        }
    }
    
    public Auto(String make, String model, LocalDate year){
        setMake(make);
        setModel(model);
        setYear(year);
    }

    public String toString(){
        return getClass().getSimpleName() + ": \n" + make + "\n" + model + "\n" + year + " ("+age+"y/o) \n";
    }
}
