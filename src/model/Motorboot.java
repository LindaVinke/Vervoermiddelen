package model;

/**
 * @author Linda Vinke
 * <p>
 * Uitwerking van opdracht
 * <p>
 * Doel:
 */
public class Motorboot extends Vaartuig {
    private String soortBrandstof;

    public Motorboot(String merk, String type, double lengte, String soortBrandstof) {
        super(merk, type, lengte);
        this.soortBrandstof = soortBrandstof;
    }

    @Override
    public String geeftAandrijfKracht() {
        return (this.soortBrandstof + " motor");
    }
}
