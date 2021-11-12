package ViskaCLIGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Inventory {

    private List<Objects> backpack = new ArrayList<>();

    public Inventory(List<Objects> backpack) {
        this.backpack = backpack;
    }

    public List<Objects> getBackpack() {
        return backpack;
    }

    public void setBackpack(List<Objects> backpack) {
        this.backpack = backpack;
    }
}
