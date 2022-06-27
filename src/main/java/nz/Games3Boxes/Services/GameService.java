package nz.Games3Boxes.Services;

import nz.Games3Boxes.Models.Game;
import nz.Games3Boxes.Models.GameBox;

import java.util.List;
import java.util.Random;

public class GameService {

    public Boolean switchBoxOneGame(Integer number_of_boxes, Integer number_of_win_boxes) {
        Game game = new Game();
        BoxService boxService = new BoxService();

        List<GameBox> boxes = boxService.initiateBoxes(number_of_boxes, number_of_win_boxes);
        game.setBoxes(boxes);
        Integer chosenBox = new Random().nextInt(boxes.size());
        Boolean content = boxes.get(chosenBox).getMoney();
        return boxService.getContentInSwitchedBox(content);
    }
}
