package org.simulation.action;

import org.simulation.Map;
import org.simulation.Renderer;
import org.simulation.entity.Entity;
import org.simulation.entity.creature.Creature;

import static org.simulation.Main.simulation;

public class TurnAction extends Action {
    public void processCreatureMoves(Map mapObj) {
        Entity[][] map = mapObj.getMap();

        for (Entity[] entities : map) {
            for (Entity entity : entities) {
                if (entity instanceof Creature creature) {
                    creature.makeMove();
                }
            }
        }

        mapObj.refreshMap();
    }

    public void renderMap(Map map) {
        Renderer renderer = simulation.getRenderer();
        renderer.renderMap(map);
    }
}

