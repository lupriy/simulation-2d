package org.simulation.entity;

import org.simulation.Coordinates;

public class Grass extends Entity {
    public Grass(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Grass() {
        this.coordinates = new Coordinates();
    }

    @Override
    public String toString() {
        return "☘\uFE0F";
    }
}
