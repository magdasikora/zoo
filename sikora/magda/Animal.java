package pl.devopsi.akademia.sikora.magda;

import java.util.List;
import java.util.Objects;

public class  Animal implements Speakable {
    private String name;
    private int yearOfBirth;
    private Type type;

    public int CURRENT_YEAR = 2022;

    public Animal(String name, int yearOfBirth, Type type) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Type getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return getYearOfBirth() == animal.getYearOfBirth() && getName().equals(animal.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getYearOfBirth(), getType());
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return getName() + " " + getYearOfBirth() + " " + getType();

    }

    public int getAge() {
        return CURRENT_YEAR - yearOfBirth;}

    public void showAges(){
            System.out.println(getAge());
        }


    @Override
    public void sound() {
        System.out.println("wydaje dźwięki");

    }
}






















