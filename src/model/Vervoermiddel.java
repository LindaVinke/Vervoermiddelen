package model;

/**
 * @author Linda Vinke
 * <p>
 * Uitwerking van opdracht Vervoersmiddelen
 * <p>
 * Doel:
 */
public abstract class Vervoermiddel {
    private int id;
    private static int aantalVervoermiddelen = 0;
    private String merk;
    private String type;

    protected Vervoermiddel(String merk, String type) {
        this.merk = merk;
        this.type = type;
        this.id = ++aantalVervoermiddelen;
    }

    public abstract String geeftAandrijfKracht();

    public String toString(){
        return  "Vervoermiddel #" + id + " " + merk+ " " + type + " aangedreven door " + geeftAandrijfKracht();
    }

}


