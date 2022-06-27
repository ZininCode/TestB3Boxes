package nz.Games3Boxes.Services;

import static java.lang.Math.round;

public class GameControlService {
    public long runGames(long number_of_games, Integer number_of_boxes, Integer number_of_win_boxes) {
        long winCountSwitched = 0;
        long winCountStayed = 0;


        for (long i = 0; i < number_of_games; i++) {
            boolean winResultSwitched = new GameService().switchBoxOneGame(number_of_boxes, number_of_win_boxes);
            if (winResultSwitched) {
                winCountSwitched++;
            }
            else {
                winCountStayed++;
            }
        }
        double switchedOverStayedWinsRatio = (double) winCountSwitched / winCountStayed;
        long chanceChange = round(100 * (switchedOverStayedWinsRatio - 1));
        return chanceChange;
    }





}
