package pl.devopsi.akademia.sikora.magda;

public class Fish extends Animal {
    private int numbeOfFins;
    private boolean isSaltWater;

    public int getNumbeOfFins() {
        return numbeOfFins;
    }

    public void setNumbeOfFins(int numbeOfFins) {
        this.numbeOfFins = numbeOfFins;
    }

    public boolean getIsSaltWater() {
        return isSaltWater;
    }

    public void setIsSaltWater(boolean isSaltWater) {
        this.isSaltWater = isSaltWater;
    }

    public Fish(String name, int yearOfBirth, Type type, int numbeOfFins, boolean isSaltWater) {
        super(name, yearOfBirth, type);
        this.numbeOfFins = numbeOfFins;
        this.isSaltWater = isSaltWater;
    }
        @Override
        public void sound () {
            System.out.println("Ryba " + getName() + " wydaje dźwięk plum");
        }
    }
