package nz.Games3Boxes.Models;

import java.util.List;

public class Game {
    private List<GameBox> boxes;

    public List<GameBox> getBoxes() {
        return boxes;
    }
    public void setBoxes(List<GameBox> boxes) {
        this.boxes = boxes;
    }
}
