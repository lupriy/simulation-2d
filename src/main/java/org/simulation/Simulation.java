package org.simulation;

import org.simulation.action.Action;
import org.simulation.action.InitAction;
import org.simulation.action.TurnAction;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Simulation {
    private final InitAction initAction = new InitAction();
    private final TurnAction turnAction = new TurnAction();
    private final Renderer renderer = new Renderer();
    private Map map;
    private int movesCounter = 0;
    private boolean isGameStopped = false;

    public void nextTurn() {
        turnAction.processCreatureMoves(map);
        turnAction.renderMap(map);
        System.out.println(movesCounter);
    }

    public void startSimulation() throws InterruptedException {
        map = initAction.initMap();

        while (!isGameStopped) {
            nextTurn();
            movesCounter++;
            TimeUnit.SECONDS.sleep(1);
        }
    }

    public void stopSimulation() {
        isGameStopped = true;
    }

    public Map getMap() {
        return map;
    }

    public Renderer getRenderer() {
        return renderer;
    }
}
