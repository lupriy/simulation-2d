package org.simulation.entity.creature;

import org.simulation.entity.Entity;

public abstract class Creature extends Entity {
    int hp;
    int speed;

    public abstract void makeMove();
}
