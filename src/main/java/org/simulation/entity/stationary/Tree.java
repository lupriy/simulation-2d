package org.simulation.entity.stationary;

import org.simulation.Coordinates;
import org.simulation.entity.Entity;

public class Tree extends Stationary {


    public Tree(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Tree() {
        this.coordinates = new Coordinates();
    }

    @Override
    public String toString() {
        return "\uD83C\uDF33";
    }
}
