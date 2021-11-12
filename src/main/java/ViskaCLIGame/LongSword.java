package ViskaCLIGame;

public class LongSword implements Weapon {

    private int damage = 12;
    private int durability;

    public LongSword() {
    }

    public LongSword(int damage, int durability) {
        this.damage = damage;
        this.durability = durability;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }
}
