package model;

/**
 * @author Linda Vinke
 * <p>
 * Uitwerking van opdracht
 * <p>
 * Doel:
 */
public class Koets extends Voertuig {
    private int aantalPaarden;
    protected static final int AANTAL_WIELEN = 4;

    public Koets(String merk, String type, int gewicht, int aantalPaarden) {
        super(merk, type, AANTAL_WIELEN, gewicht);
        this.aantalPaarden = aantalPaarden;

    }

    @Override
    public String geeftAandrijfKracht() {
        return this.aantalPaarden + "paarden";
    }
}
