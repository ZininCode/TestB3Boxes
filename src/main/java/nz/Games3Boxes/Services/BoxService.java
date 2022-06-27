package nz.Games3Boxes.Services;

import nz.Games3Boxes.Models.GameBox;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BoxService {


    public List<GameBox> initiateBoxes(Integer number_of_boxes, Integer number_of_win_boxes) {

        List<GameBox> boxes = new ArrayList<>();
        List<GameBox> emptyBoxes =boxes;
        Integer winsCount = 0;

        for (int i = 0; i < number_of_boxes; i++) { //initiate all boxes with empty values
            boxes.add(new GameBox(false));

        }
        for (int i = 0; i < number_of_win_boxes; i++){//initiate empty boxes with win money
            int index = getRandomEmptyBoxIndex(boxes);
            GameBox box = boxes.get(index);
            box.setMoney(true);
            boxes.set(index, box);
        }
        return boxes;
    }

    public Integer getRandomEmptyBoxIndex(List<GameBox> boxes) {
        boolean emptyBoxFound = false;
        while (!emptyBoxFound) {
            int index = new Random().nextInt(boxes.size());
            Boolean money = boxes.get(index).getMoney();
            if(!money){
                return index;
            }
        }
        return null;
    }

    public Boolean getContentInSwitchedBox(Boolean money) {
        if (money){
            return false;
        }
        else{
            return true;
        }
    }
}
