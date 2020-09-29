package model;

/**
 * @author Linda Vinke
 * <p>
 * Uitwerking van opdracht
 * <p>
 * Doel:
 */
public abstract class Vaartuig extends Vervoermiddel {
    private double lengteInMeter;

    protected Vaartuig(String merk, String type, double lengte){
        super(merk, type);
        this.lengteInMeter = lengte;
    }

}
