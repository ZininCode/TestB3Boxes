package nz.Games3Boxes.Services;

public class GameControlService {
    public Integer runGames(Integer number_of_games, Integer number_of_boxes, Integer number_of_win_boxes) {
        Integer changedBoxWins = 0;

        for (int i = 0; i < number_of_games; i++) {
            boolean resultOneGame = new GameService().switchBoxOneGame(number_of_boxes, number_of_win_boxes);
            if (resultOneGame) {
                changedBoxWins++;
            }
        }

        return changedBoxWins;
    }





}
