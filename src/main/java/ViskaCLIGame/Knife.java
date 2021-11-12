package ViskaCLIGame;

public class Knife implements Weapon {

    private int damage = 8;
    private int durability;

    public Knife() {
    }

    public Knife(int damage, int durability) {
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
