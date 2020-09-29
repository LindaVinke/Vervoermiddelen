package model;

/**
 * @author Linda Vinke
 * <p>
 * Uitwerking van opdracht
 * <p>
 * Doel:
 */
public abstract class Voertuig extends Vervoermiddel {
    private int aantalWielen;
    private int gewicht;

    protected Voertuig(String merk, String type, int aantalWielen, int gewicht) {
        super(merk, type);
        this.aantalWielen = aantalWielen;
        this.gewicht = gewicht;
    }
}
