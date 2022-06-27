package nz.Games3Boxes.Services;

import nz.Games3Boxes.Models.GameBox;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BoxServiceTest {

    @Test
    void initiateBoxesTest() {
        for (int i = 0; i < 100; i++) { // repeat  many random initiations
            List<GameBox> boxes =
                    new BoxService().initiateBoxes(3, 1);
            GameBox empty = new GameBox(false);
            GameBox withMoney = new GameBox(true);
            List<GameBox> boxes1 = Arrays.asList(withMoney, empty, empty);
            List<GameBox> boxes2 = Arrays.asList(empty, withMoney, empty);
            List<GameBox> boxes3 = Arrays.asList(empty, empty, withMoney);

            assertTrue((listEquals(boxes, boxes1)) || (listEquals(boxes, boxes2)) || (listEquals(boxes, boxes3)));
        }
    }

    @Test  void getRandomEmptyBoxIndexTest() {
        for (int i = 0; i < 100; i++) { // repeat  many random runs
            GameBox empty = new GameBox(false);
            GameBox withMoney = new GameBox(true);
            List<GameBox> boxes1 = Arrays.asList(withMoney, empty, empty);
            List<GameBox> boxes2 = Arrays.asList(empty, withMoney, empty);
            List<GameBox> boxes3 = Arrays.asList(empty, empty, withMoney);
            Integer index1 = new BoxService().getRandomEmptyBoxIndex(boxes1);
            Integer index2 = new BoxService().getRandomEmptyBoxIndex(boxes2);
            Integer index3 = new BoxService().getRandomEmptyBoxIndex(boxes3);
            assertTrue((index1 == 1 || index1 == 2) && (index2 == 0 || index2 == 2) && (index3 == 0 || index3 == 1));
        }
    }

    @Test
    void getWinResultIfSwitchedBoxTest() {
        GameBox empty = new GameBox(false);
        GameBox withMoney = new GameBox(true);
        List<GameBox> boxes1 = Arrays.asList(withMoney, empty, empty);
        List<GameBox> boxes2 = Arrays.asList(empty, withMoney, empty);
        List<GameBox> boxes3 = Arrays.asList(empty, empty, withMoney);
        Boolean result1 = new BoxService().getWinResultIfSwitchedBox(boxes1.get(0).getMoney());
        Boolean result2 = new BoxService().getWinResultIfSwitchedBox(boxes1.get(1).getMoney());
        Boolean result3 = new BoxService().getWinResultIfSwitchedBox(boxes1.get(2).getMoney());
        Boolean result4 = new BoxService().getWinResultIfSwitchedBox(boxes2.get(0).getMoney());
        Boolean result5 = new BoxService().getWinResultIfSwitchedBox(boxes2.get(1).getMoney());
        Boolean result6 = new BoxService().getWinResultIfSwitchedBox(boxes2.get(2).getMoney());
        Boolean result7 = new BoxService().getWinResultIfSwitchedBox(boxes3.get(0).getMoney());
        Boolean result8 = new BoxService().getWinResultIfSwitchedBox(boxes3.get(1).getMoney());
        Boolean result9 = new BoxService().getWinResultIfSwitchedBox(boxes3.get(2).getMoney());
        assertTrue(result1 == false && result2 == true && result3 == true
                && result4 == true && result5 == false && result6 == true
                && result7 == true && result8 == true && result9 == false);

    }

    private boolean listEquals(List<GameBox> boxes, List<GameBox> boxes1) {
        boolean result1 = boxes.get(0).getMoney().equals(boxes1.get(0).getMoney());
        boolean result2 = boxes.get(1).getMoney().equals(boxes1.get(1).getMoney());
        boolean result3 = boxes.get(2).getMoney().equals(boxes1.get(2).getMoney());

        if (result1 && result2 && result3) {
            return true;
        } else {
            return false;
        }

    }

}
