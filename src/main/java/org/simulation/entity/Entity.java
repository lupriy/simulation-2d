package org.simulation.entity;

import org.simulation.Coordinates;

public abstract class Entity {
    protected Coordinates coordinates;

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }
}
