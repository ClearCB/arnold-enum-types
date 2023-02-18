package edu.craptocraft.arnoldenumtypes;

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
}
