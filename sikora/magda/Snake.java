package pl.devopsi.akademia.sikora.magda;

public class Snake extends Animal {
    private boolean isVenomous;
    private int lenghtInMeters;

    public boolean isVenomous() {
        return isVenomous;
    }

    public void setVenomous(boolean venomous) {
        isVenomous = venomous;
    }

    public int getLenght() {
        return lenghtInMeters;
    }

    public void setLenght(int lenght) {
        this.lenghtInMeters = lenght;
    }

    public Snake(String name, int yearOfBirth, Type type, boolean isVenomous, int lenght) {
        super(name, yearOfBirth, type);
        this.isVenomous = isVenomous;
        this.lenghtInMeters = lenght;


    }

    @Override
    public void sound() {
        System.out.println( "Wąż " + getName() + " wydaje dźwięk sss ");
    }
}
