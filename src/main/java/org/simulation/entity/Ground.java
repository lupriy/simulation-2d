package org.simulation.entity;

import org.simulation.Coordinates;

public class Ground {
    private Coordinates coordinates;

    public Ground(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Ground() {
        this.coordinates = new Coordinates();
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    @Override
    public String toString() {
        return "G";
    }
}
