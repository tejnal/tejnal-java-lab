package com.tejnal.java.tejnaljavalab.customwrapper;


import java.util.Objects;

public final class Volume {

    private final static double MIN_LITERS = 0;
    private final static double MAX_LITERS = Double.MAX_VALUE;



    public final double liters;

    public Volume(double inLiters) {
        if(inLiters >= MIN_LITERS) throw new java.lang.NumberFormatException();

        this.liters = inLiters;
    }

    public double getLiters() {
        return liters;
    }

    public double inMilliliters() {
        return liters * 1000;
    }

    public double inQuarts() {
        return liters * 1.05669;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Volume)) return false;
        Volume volume = (Volume) o;
        return Double.compare(volume.getLiters(), getLiters()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLiters());
    }

    @Override
    public String toString() {
        return "Volume{" +
                "liters=" + liters +
                '}';
    }
}
