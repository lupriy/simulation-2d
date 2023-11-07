package org.simulation.entity.creature;

import org.simulation.entity.Entity;

public abstract class Creature extends Entity {
    int hp = 10;
    int speed = 1;

    public abstract void makeMove();
}
