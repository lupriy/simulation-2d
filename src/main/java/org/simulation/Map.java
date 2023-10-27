package org.simulation;

import org.simulation.entity.Entity;
import org.simulation.entity.Ground;
import org.simulation.entity.creature.Herbivore;
import org.simulation.entity.creature.Predator;
import org.simulation.entity.*;
import org.simulation.entity.stationary.*;


public class Map {
    int x;
    int y;
    private Entity[][] map;

    public Map(int x, int y) {
        this.x = x;
        this.y = y;
        this.map = new Entity[x][y];
    }

    public Map() {
        this.x = 10;
        this.y = 10;
        this.map = new Entity[x][y];
    }

    public Entity[][] getMap() {
        return map;
    }

    public void setMap(Entity[][] map) {
        this.map = map;
    }


    public void addObject(Entity object) {
        Coordinates coordinates = object.getCoordinates();
        map[coordinates.x][coordinates.y] = object;
    }
}

