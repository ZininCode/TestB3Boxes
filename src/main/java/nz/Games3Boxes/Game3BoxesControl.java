package nz.Games3Boxes;

import nz.Games3Boxes.Services.*;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Game3BoxesControl {
    private final Integer NUMBER_OF_GAMES = 1000000;
    private final Integer NUMBER_OF_BOXES = 3;
    private final Integer NUMBER_OF_WIN_BOXES = 1;

    public void answerForSwitchBoxWinChance() {
        Integer switchBoxWins = new GameControlService().runGames(NUMBER_OF_GAMES, NUMBER_OF_BOXES, NUMBER_OF_WIN_BOXES);

        double chance = (double) switchBoxWins / NUMBER_OF_GAMES;
        NumberFormat formatter = new DecimalFormat("#0.00");
        System.out.println("win chances " + formatter.format(chance));
    }
}
