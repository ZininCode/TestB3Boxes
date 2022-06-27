package nz.Games3Boxes.Models;

public class GameBox {
    private Boolean money;

    public GameBox(Boolean money) {
        this.money = money;
    }

    public GameBox() {
    }

    public Boolean getMoney() {
        return money;
    }

    public void setMoney(Boolean money) {
        this.money = money;
    }
}
