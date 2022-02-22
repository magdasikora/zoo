package pl.devopsi.akademia.sikora.magda;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Type type = Type.REPTILE;

        Zoo zoo = new Zoo("Wrocławksie Zoo", 1864);

//tworzenie obiektów:
        Animal animal = new Animal("Dave", 2020, Type.REPTILE);

        //tworzenie obiektów klas dziedziczących od Animal:

        Snake snake = new Snake("Snape", 2018, Type.REPTILE, true, 10);
        Snake snake1 = new Snake("Severus", 2019, Type.REPTILE, true, 15);
        Dog dog = new Dog("Rex", 2015, Type.MAMMAL, "Jamnik", "short");
        Fish fish = new Fish("Doris", 2021, Type.FISH, 6, true);

// dodanie obiektów do listy <Animal>
        zoo.addAnimal(new Animal("Max", 2019, Type.REPTILE));
        zoo.addAnimal(new Animal("Ted", 2018, Type.REPTILE));
        zoo.addAnimal(animal);
        zoo.addAnimal(snake);
        zoo.addAnimal(snake1);
        zoo.addAnimal(dog);
        zoo.addAnimal(fish);


// demonstracja metod które udało się zrobić:
        zoo.showAnimals();

        int howMuch = zoo.countAnimals();
        System.out.println("w  zoo jest " + howMuch + " zwierząt");

        zoo.showInfo();

        List<Speakable> speakables = new ArrayList<>();
        speakables.add(animal);
        speakables.add(snake);
        speakables.add(dog);
        speakables.add(fish);

        for (Speakable speakable : zoo.getAnimals()) {
            speakable.sound();}


        System.out.println("średnia wieku zwierząt w zoo wynosi "+ zoo.aveAge()+ " lata");


        }
    }







