package org.example.rpg;

public class Troll extends Monster implements Bleedable, Poisonable {

    private boolean canBleed;
    private boolean canBePoisoned;

    public Troll(String name, int hitPoints, double damage, boolean canBleed, boolean canBePoisoned) {
        super(name, hitPoints, damage);
        this.canBleed = canBleed;
        this.canBePoisoned = canBePoisoned;
    }

    @Override
    public double bleed() {
        if (canBleed) {
            return getDamage() * 0.25;
        }
        return 0;
    }

    @Override
    public double poison() {
        if (canBePoisoned) {
            return getDamage() * 0.3;
        }
        return 0;
    }
}
