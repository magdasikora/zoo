package pl.devopsi.akademia.sikora.magda;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private String name;
    private int yearOfEstablishment;
    private List<Animal> animals;

    {
        animals = new ArrayList<>();
    }

    public Zoo(String name, int yearOfEstablishment) {
        this.name = name;
        this.yearOfEstablishment = yearOfEstablishment;
    }

    public Zoo(String name, int yearOfEstablishment, List<Animal> animals) {
        this.name = name;
        this.yearOfEstablishment = yearOfEstablishment;
        this.animals = animals;

    }

    public List<Animal> getAnimals() {
        return animals;
    }


    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void showAnimals() {
        {
            System.out.println(animals);
        }
    }

    public int countAnimals() {
        return animals.size();
    }


    public void showInfo() {
        {
            System.out.println("nazwa: " + name + ", rok założenia: " + yearOfEstablishment + "średnia wieku zwierząt wynosi " +aveAge());
        }
    }



    public double aveAge() {
        double sumOfAges = 0;
        for (Animal animal : animals) {
            sumOfAges = sumOfAges + animal.getAge();
        }
        return sumOfAges / animals.size();
    }
}
















