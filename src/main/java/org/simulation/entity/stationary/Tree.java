package org.simulation.entity.stationary;

import org.simulation.Coordinates;
import org.simulation.entity.Entity;

public class Tree extends Entity {
    private final Coordinates coordinates;

    public Tree(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Tree() {
        this.coordinates = new Coordinates();
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    @Override
    public String toString() {
        return "T";
    }
}
