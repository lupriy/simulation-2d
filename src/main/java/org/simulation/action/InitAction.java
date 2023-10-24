package org.simulation.action;

import org.simulation.Coordinates;
import org.simulation.Map;
import org.simulation.entity.Entity;
import org.simulation.entity.Grass;
import org.simulation.entity.creature.*;
import org.simulation.entity.stationary.Rock;
import org.simulation.entity.stationary.Tree;

import java.util.*;

public class InitAction extends Action {

    private Map map;

    public Map initMap() {
        map = new Map();

        HashMap<Entity, Integer> pool = createObjectPoolForMap(map);

        pool.forEach((entity, amountOfEntity) -> {
            for (int i = 0; i < amountOfEntity; i++) {
                Entity entityWithRandomCoordinates = assignRandomCoordinatesToEntity(entity);
                map.addObject(entityWithRandomCoordinates);
            }
        });

        return map;
    }

    private HashMap<Entity, Integer> createObjectPoolForMap(Map map) {
        HashMap<Entity, Integer> pool = new HashMap<>();

        int x = map.getMap().length;
        int y = map.getMap()[0].length;
        int mapArea = x * y;

        int amountOfGrass = mapArea / 2;
        pool.put(new Grass(), amountOfGrass);

        int amountOfHerbivores = amountOfGrass / 10;
        pool.put(new Herbivore(), amountOfHerbivores);

        int amountOfPredators = amountOfHerbivores / 10;
        pool.put(new Predator(), amountOfPredators);

        int amountOfTress = amountOfGrass / 10;
        pool.put(new Tree(), amountOfTress);

        int amountOfRocks = amountOfGrass / 10;
        pool.put(new Rock(), amountOfRocks);

        return pool;
    }


    private Entity assignRandomCoordinatesToEntity(Entity entity) {
        int xUpperBound = map.getMap().length;
        int yUpperBound = map.getMap()[0].length;

        Random random = new Random();

        int randomX = random.nextInt(xUpperBound);
        int randomY = random.nextInt(yUpperBound);

        Coordinates coordinates = new Coordinates(randomX, randomY);

        entity.setCoordinates(coordinates);
        return entity;
    }
}

