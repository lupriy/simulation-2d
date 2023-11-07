package org.simulation.entity;

import org.simulation.Coordinates;

public class Ground extends Entity {
    public Ground(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Ground() {
        this.coordinates = new Coordinates();
    }

    @Override
    public String toString() {
        return "\uD83D\uDFEB";
    }
}
