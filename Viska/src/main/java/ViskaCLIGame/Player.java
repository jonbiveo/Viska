package ViskaCLIGame;

import java.math.BigDecimal;

public class Player {

    private String name;
    private BigDecimal health;

    public Player(String name, BigDecimal health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getHealth() {
        return health;
    }

    public void setHealth(BigDecimal health) {
        this.health = health;
    }
}
