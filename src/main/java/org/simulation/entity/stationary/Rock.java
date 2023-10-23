package org.simulation.entity.stationary;

import org.simulation.Coordinates;
import org.simulation.entity.Entity;

public class Rock extends Entity {
    private final Coordinates coordinates;

    public Rock(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Rock() {
        this.coordinates = new Coordinates();
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    @Override
    public String toString() {
        return "R";
    }
}
