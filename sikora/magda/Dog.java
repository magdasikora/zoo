package pl.devopsi.akademia.sikora.magda;

public class Dog extends Animal {
    private String race;
    private String typeOfHair;


    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getTypeOfHair() {
        return typeOfHair;
    }

    public void setTypeOfHair(String typeOfHair) {
        this.typeOfHair = typeOfHair;
    }

    public Dog(String name, int yearOfBirth, Type type, String race, String typeOfHair) {
        super(name, yearOfBirth, type);
        this.race = race;
        this.typeOfHair = typeOfHair;
    }


    @Override
    public void sound() {
        System.out.println("Pies " + getName() + " wydaje dźwięk hau-hau");

    }
}



