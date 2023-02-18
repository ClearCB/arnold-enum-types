package edu.craptocraft.arnoldenumtypes;

import java.util.EnumSet;
import java.util.Set;

public enum Planeta {
    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6),
    MARS(6.421e+23, 3.3972e6),
    JUPITER(1.9e+27, 7.1492e7),
    SATURN(5.688e+26, 6.0268e7),
    URANUS(8.686e+25, 2.5559e7),
    NEPTUNE(1.024e+26, 2.4746e7);

    private final double masa;
    private final double radio;
    private final double G = 6.67300E-11;

    Planeta(double masa, double radio) {
        this.masa = masa;
        this.radio = radio;
    }

    protected double getMasa() {
        return this.masa;
    }

    protected double getRadio() {
        return this.radio;
    }

    private double getconstanteGravedad() {
        return this.G;
    }

    public double gravedadSuperficie() {
        return this.getconstanteGravedad() * (this.getMasa() / Math.pow(this.getRadio(), 2.0));
    }

    // Overloading the method
    public double gravedadSuperficie(Planeta planeta) {
        return planeta.getconstanteGravedad() * (planeta.getMasa() / Math.pow(planeta.getRadio(), 2.0));
    }

    public double masaEnPlaneta(double pesoEnTierra) {
        return pesoEnTierra / this.gravedadSuperficie(EARTH);
    }

    public double pesoSuperficie(double peso) {
        return this.masaEnPlaneta(peso) * this.gravedadSuperficie();
    }

    public static Set<Planeta> getPlanetasTerrestres(){
        return EnumSet.range(MERCURY, MARS);

    }
    public static Set<Planeta> getPlanetasGaseosos(){
        return EnumSet.complementOf((EnumSet<Planeta>) getPlanetasTerrestres());
    }
}
