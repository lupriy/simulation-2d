package org.simulation.action;

import org.simulation.Coordinates;
import org.simulation.Map;
import org.simulation.entity.Entity;
import org.simulation.entity.Grass;
import org.simulation.entity.Ground;
import org.simulation.entity.creature.*;
import org.simulation.entity.stationary.Web;
import org.simulation.entity.stationary.Tree;


import java.util.HashMap;
import java.util.Random;

public class InitAction extends Action {

    private Map map;


    public Map initMap() {
        map = new Map();

        HashMap<Integer, Integer> pool = createObjectPoolForMap(map);

        for (int i = 0; i < pool.size(); i++) {
            int amountOfEntity = pool.get(i);

            for (int j = 0; j < amountOfEntity; j++) {
                if (i == 0) {
                    Grass grass = new Grass();
                    assignRandomCoordinatesToEntity(grass);
                    map.addObject(grass);
                }
                if (i == 1) {
                    Herbivore herbivore = new Herbivore();
                    assignRandomCoordinatesToEntity(herbivore);
                    map.addObject(herbivore);
                }
                if (i == 2) {
                    Predator predator = new Predator();
                    assignRandomCoordinatesToEntity(predator);
                    map.addObject(predator);
                }
                if (i == 3) {
                    Tree tree = new Tree();
                    assignRandomCoordinatesToEntity(tree);
                    map.addObject(tree);
                }
                if (i == 4) {
                    Web web = new Web();
                    assignRandomCoordinatesToEntity(web);
                    map.addObject(web);
                }
            }
        }


        for (int i = 0; i < map.getMap().length; i++) {
            for (int j = 0; j < map.getMap()[i].length; j++) {
                Entity entity = map.getMap()[i][j];

                if (entity == null) {
                    Ground ground = new Ground(new Coordinates(i, j));
                    map.addObject(ground);
                }
            }
        }

        return map;
    }


    private HashMap<Integer, Integer> createObjectPoolForMap(Map map) {
        HashMap<Integer, Integer> pool = new HashMap<>();

        int x = map.getMap().length;
        int y = map.getMap()[0].length;
        int mapArea = x * y;

        int amountOfGrass = mapArea / 2;
        pool.put(0, amountOfGrass);

        int amountOfHerbivores = amountOfGrass / 10;
        pool.put(1, amountOfHerbivores);

        int amountOfPredators = amountOfHerbivores / 5;
        pool.put(2, amountOfPredators);

        int amountOfTress = amountOfGrass / 10;
        pool.put(3, amountOfTress);

        int amountOfRocks = amountOfGrass / 10;
        pool.put(4, amountOfRocks);

        return pool;
    }


    private <T extends Entity> void assignRandomCoordinatesToEntity(T entity) {
        int xUpperBound = map.getMap().length;
        int yUpperBound = map.getMap()[0].length;

        Random random = new Random();

        int randomX = random.nextInt(xUpperBound);
        int randomY = random.nextInt(yUpperBound);

        Coordinates coordinates = new Coordinates(randomX, randomY);

        entity.setCoordinates(coordinates);
    }
}