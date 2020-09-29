package model;

/**
 * @author Linda Vinke
 * <p>
 * Uitwerking van opdracht
 * <p>
 * Doel:
 */
public class Zeilboot extends Vaartuig {
    private String soortBrandstof;

    public Zeilboot(String merk, String type, double lengte) {
        super(merk, type, lengte);
    }

    @Override
    public String geeftAandrijfKracht() {
        return "windkracht";
    }
}
