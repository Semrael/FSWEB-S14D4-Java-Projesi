package Monster;

import Monster.util.Constants;

public class WereWolf extends Monster implements Bleedable{
    public WereWolf(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double bleed() {
        return getDamage()* Constants.BLEED_PERCENTAGE;
    }

    @Override
    public double bleed(int level) {
        return getDamage()*level*Constants.BLEED_PERCENTAGE;
    }

    @Override
    public double attact() {
        return getDamage()+bleed();
    }
}
