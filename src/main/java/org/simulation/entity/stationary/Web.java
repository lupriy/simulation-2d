package org.simulation.entity.stationary;

import org.simulation.Coordinates;

public class Web extends Stationary {
    private final Coordinates coordinates;

    public Web(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Web() {
        this.coordinates = new Coordinates();
    }


    @Override
    public String toString() {
        return "\uD83D\uDD78\uFE0F";
    }
}
