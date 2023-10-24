package org.simulation;

import org.simulation.entity.Entity;
import org.simulation.entity.Ground;
import org.simulation.entity.creature.Herbivore;
import org.simulation.entity.creature.Predator;
import org.simulation.entity.*;
import org.simulation.entity.stationary.*;

import java.util.Random;

public class Map {
    private Entity[][] map;

    public void initEmptyMap(int x, int y) {
        this.map = new Entity[x][y];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = new Ground(new Coordinates(i, j));
            }
        }
    }

    public Entity[][] fillMapWithRandomObjects(Entity[][] map) {
        int[] objectsPool = createPoolOfObjectsForMap(map);

        for (int i = 0; i < objectsPool.length; i++) {
            for (int j = 0; j < objectsPool[i]; j++) {
                Entity entity = null;

                if (i == 0) {
                    entity = new Grass();
                }
                if (i == 1) {
                    entity = new Herbivore();
                }
                if (i == 2) {
                    entity = new Predator();
                }
                if (i == 3) {
                    entity = new Tree();
                }
                if (i == 4) {
                    entity = new Rock();
                }

                Coordinates randomCoordinates = randomizeCoordinatesOfObject(entity);
            }
        }


        return map;
    }

    private int[] createPoolOfObjectsForMap(Entity[][] map) {
        int x = map.length;
        int y = map[0].length;
        int mapArea = x * y;

        int amountOfGrass = mapArea / 2;
        int amountOfHerbivores = amountOfGrass / 10;
        int amountOfPredators = amountOfHerbivores / 10;
        int amountOfTress = amountOfGrass / 10;
        int amountOfRocks = amountOfGrass / 10;

        return new int[]{amountOfGrass, amountOfHerbivores, amountOfPredators, amountOfTress, amountOfRocks};
    }

    private Coordinates randomizeCoordinatesOfObject(Entity entity) {
        int xUpperBound = map.length;
        int yUpperBound = map[0].length;

        Random random = new Random();

        int randomX = random.nextInt(xUpperBound);
        int randomY = random.nextInt(yUpperBound);

        return new Coordinates(randomX, randomY);
    }
}
