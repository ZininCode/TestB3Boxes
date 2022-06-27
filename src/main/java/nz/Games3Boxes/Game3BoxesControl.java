package nz.Games3Boxes;

import nz.Games3Boxes.Services.*;
import static java.lang.Math.abs;

public class Game3BoxesControl {
    private final long NUMBER_OF_GAMES = 1000000;
    private final Integer NUMBER_OF_BOXES = 3;
    private final Integer NUMBER_OF_WIN_BOXES = 1;

    public void chanceOfWinIfSwitchedBox() {
        long switchedOverStayedChanceChange = new GameControlService().runGames(NUMBER_OF_GAMES, NUMBER_OF_BOXES, NUMBER_OF_WIN_BOXES);

        if (switchedOverStayedChanceChange > 0) {
            System.out.println("Switching boxes increases win chances by around " + switchedOverStayedChanceChange + " percents.");
        } else {
            System.out.println("Switching boxes decreases win chances by around " + abs(switchedOverStayedChanceChange) + " percents.");
        }
    }
}

