package theZoo;

import java.time.LocalDate;

public class Cat extends Mammal{

    ////////// attributes/////////
    private String breed;
    private LocalDate dateOfBirth;
    private String name;
    ///////////Constructors///////////

    public Cat(){
        this("Moggy");
    };
    public Cat(String name){
        this(name, LocalDate.now());

    }

    public Cat(String name, LocalDate dateOfBirth){
        this(name, dateOfBirth, "DSH");

    };
    public Cat(String name, LocalDate dateOfBirth, String breed){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.breed = breed;
    };
    /////////Methods///////////
    public String purr(){
       return "Puuuurrrr";
    }

    public String getBreed() {
        return breed;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("I eat mice");
    }
}
